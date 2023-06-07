import PySimpleGUI as sg
import webbrowser

import pandas as pd
import scraper
import urllib.parse
import Queue
import Stack
from fpdf import FPDF
import Pdf

# buat queue dan stack
queue = Queue.Queue()
keranjang = Stack.Stack()

# table utama gui definition

table_utama = sg.Table(values='', headings=["Nama Barang", "Harga", "Rating", "Toko", "Kota"], key="-TABLE-", enable_events=True, size=(1000,20), auto_size_columns=False, col_widths=[40, 14, 8, 20, 20], vertical_scroll_only=False, justification='l',font="None 15")

pilihan_rating = [0, 1, 2, 3, 4, 5]  # Menghasilkan 0 - 5

# layout utama program GUI
layout = [
        [sg.T("Input Nama barang: "), sg.I(key="-ITEMNAME-", font=("None 15"), size=(44,1))],
        [sg.Text('Rating:'), sg.InputCombo(pilihan_rating, default_value='0', size=(5, 1), key='-RATING-')],
        [sg.T('Jumlah produk yang ingin ditampilkan: '), sg.Slider(range=(10,200), orientation='h', key="-LISTAMOUNT-", default_value=10)],
        [table_utama],
        
        [sg.B("Cari Barang >", size=(30,1), key="-SEARCH-", button_color="blue")],
        [sg.B("Go to Link >", size=(30,1), key="-GOTOLINK-", button_color="blue")],
        [sg.B("Tambah", size=(10,1), button_color="green"), sg.B("Lihat Keranjang", key="-LOOKBUCKET-", button_color="green"), sg.B("EXCEL", size=(10,1), key="-EXCEL-", button_color="green"), sg.B("Selesai Memilih", key="-ENDCHOOSE-", button_color="blue"),  sg.Exit()]
        ]

window = sg.Window("Wishlist Scrapper (Menu Utama)", layout, finalize=True)
window.maximize()


# fungsi-fungsi scrapper driver

# fungsi mencari barang pada website
def search(keyword, rating, amount):
    url = 'https://gql.tokopedia.com/graphql/SearchProductQueryV4'
    params = scraper.get_params(urllib.parse.quote(keyword))
    data = []
    seen_url=[]
    for i in range(0, len(params)):
        param = params[i]
        data_scrap = scraper.scrape_data(param,url,rating,seen_url)
        data.extend(data_scrap)
    # Sorting data dari termurah ke termahal
    data_sorted = list(data)
    n = len(data_sorted)
    for i in range(n):
        for j in range(0, n-i-1):
            numeric_string = ''.join(filter(str.isdigit, data_sorted[j][1]));harga1 = int(numeric_string)
            numeric_string = ''.join(filter(str.isdigit, data_sorted[j+1][1]));harga2 = int(numeric_string)
            if harga1 > harga2:
                data_sorted[j], data_sorted[j+1] = data_sorted[j+1], data_sorted[j]

    return data_sorted[0:amount] # Batas 10 teratas aja (sekarang udah diganti)

# Masukin dari keranjang stack ke antrian queue langsung
def addQueue():
    for i in range(keranjang.size):
        queue.push(keranjang.top())
        keranjang.pop()

# Masukin dari keranjang stack ke antrian queue, user memilih yang mana yang masuk antrian duluan
def orderQueue(input_urutan):
    for i in range(keranjang.size):
        urutan = int(input_urutan)
        queue.push(keranjang.stack[keranjang.size-urutan])
        keranjang.stack.pop(keranjang.size-urutan)
        keranjang.size-=1

# ini save as pdf function
def save_as_pdf(receipt_text):
    pdf = Pdf.ReceiptPDF(100,190)
    pdf.add_page() 
    pdf.chapter_body(receipt_text)
    pdf.output("receipt.pdf")

# logic setiap button di Layout gui
list_search_barang = []

while True:
    event, values = window.read()
    if event in ("Exit", sg.WIN_CLOSED):
        window.close()
        break
    elif event=="-EXCEL-":
        print(list_search_barang)
        layout_excel=[
            [sg.T("Nama file : ")],
            [sg.Input(size=(10,2),key='-FILENAME-')],
            [sg.B("Submit", size=(6,1), key='-BTNFILE-',button_color="green")]
            ]
        window_excel = sg.Window("Excel", layout_excel, finalize=True)
        nama_file=""
        while True:
            event_excel, values_excel = window_excel.read()
            if event_excel in ("Exit", sg.WIN_CLOSED):
                window_excel.close()
                break
            elif event_excel == '-BTNFILE-':
                nama_file = values_excel['-FILENAME-']
                window_excel.close()
        df = pd.DataFrame(list_search_barang, columns = ['Nama Produk', 'Harga Produk', 'Rating', 'Penjual', 'Lokasi','Link'])      
        df.to_excel(nama_file+'_data.xlsx', index = False)
        sg.popup("Data berhasil disimpan ke Excel")

    elif event == "-SEARCH-":
        if values["-ITEMNAME-"]:
            # global list_search_barang
            list_search_barang_now = search(values["-ITEMNAME-"], values["-RATING-"], int(values["-LISTAMOUNT-"]))
            list_search_barang = list_search_barang_now
            window["-TABLE-"].update(list_search_barang)
            # print(list_search_barang)

    elif event == "Tambah":
        if values["-TABLE-"]:
            indeks = values["-TABLE-"][0]
            keranjang.push(list_search_barang[indeks])
            sg.popup("Data Dimasukkan!!")
    
    # ini logic button lihat keranjang
    elif event == "-LOOKBUCKET-":
        # ini adalah layout lihat keranjang
        layout_keranjang = [
                [sg.Table(values='', headings=["Nama Barang", "Harga", "Rating", "Toko", "Kota"], key="-TABLEBUCKET-", enable_events=True, size=(1000,20), auto_size_columns=False, col_widths=[40, 14, 8, 20, 20], vertical_scroll_only=False, justification='l',font="None 15")]
            ]
        window_keranjang = sg.Window("Keranjang Anda", layout_keranjang, finalize=True)
        keranjang_stack_reversed = keranjang.stack[::-1]
        window_keranjang["-TABLEBUCKET-"].update(keranjang_stack_reversed)

    # ini logic button selesai memilih
    elif event == "-ENDCHOOSE-":
        # ini adalah logic, apakah user sudah menambahkan barang atau belum, jika belum, maka tombol tak bisa di klik , dan muncul pop up "tolong tambahkan barang terlebih dahulu"
        if keranjang.size != 0:
            # ini adalah layout endchoose (selesai memilih)
            layout_selesai_memilih = [
                [sg.Table(values='', headings=["Nama Barang", "Harga", "Rating", "Toko", "Kota"], key="-TABLEEND-", enable_events=True, size=(1000,20), auto_size_columns=False, col_widths=[40, 14, 8, 20, 20], vertical_scroll_only=False, justification='l',font="None 15")],
                [sg.B("Tambah item ke antrian (+)", size=(32,1), key="-ADDITEMTOQUEUE-", button_color="green")],
                [sg.B("Tambahkan semua item ke antrian >", size=(32,1), key="-ADDQUEUE-", button_color="green")],
                [sg.B("Lihat Antrian", size=(32,1), key="-LOOKQUEUE-", button_color="green")]
            ]
            window_selesai_memilih = sg.Window("Selesai Memilih", layout_selesai_memilih, finalize=True)
            keranjang_stack_reversed = keranjang.stack[::-1]
            window_selesai_memilih["-TABLEEND-"].update(keranjang_stack_reversed)

            # logic tombol di dalam menu end
            while True:
                    event_selesai_memilih, values_selesai_memilih = window_selesai_memilih.read()
                    if event_selesai_memilih in (sg.WINDOW_CLOSED, "-EXIT-"):
                        window_selesai_memilih.close()
                        break
                    
                    # ini logic menambahkan semua item ke queue
                    elif event_selesai_memilih == "-ADDQUEUE-":
                        addQueue()
                        sg.popup("Berhasil menambahkan semua item ke Queue")
                        window_selesai_memilih["-TABLEEND-"].update(keranjang.stack)
                        # keranjang.stack.clear()
                        
                    #  ini logic menambahkan item yang di klik ke dalam queue
                    elif event_selesai_memilih == "-ADDITEMTOQUEUE-":
                        if values_selesai_memilih["-TABLEEND-"]:
                            indeks_pilih = values_selesai_memilih["-TABLEEND-"][0]
                            queue.push(keranjang.stack[keranjang.size-indeks_pilih-1])
                            keranjang.stack.pop(keranjang.size-indeks_pilih-1)
                            keranjang.size-=1
                            keranjang_stack_reversed = keranjang.stack[::-1]
                            window_selesai_memilih["-TABLEEND-"].update(keranjang_stack_reversed)

                    # ini adalah logic melihat queue
                    elif event_selesai_memilih == "-LOOKQUEUE-":
                        # ini layout queue
                        layout_look_queue = [
                            [sg.Table(values='', headings=["Nama Barang", "Harga", "Rating", "Toko", "Kota"], key="-TABLELOOKQUEUE-", enable_events=True, size=(1000,20), auto_size_columns=False, col_widths=[40, 14, 8, 20, 20], vertical_scroll_only=False, justification='l',font="None 15")],
                            [sg.B("Done", size=(32,1), key="-DONE-", button_color="green"),sg.B("Create Receipt", size=(32,1), key="-CREATERECEIPT-", button_color="green")]
                        ]
                        window_look_queue = sg.Window("Lihat antrian", layout_look_queue, finalize=True)
                        window_look_queue["-TABLELOOKQUEUE-"].update(queue.queue)
                        while True:
                            event_look_queue, values_look_queue = window_look_queue.read()
                            if event_look_queue in (sg.WINDOW_CLOSED, "-EXIT-"):
                                window_look_queue.close()
                                break
                            elif event_look_queue == "-DONE-":
                                queue.queue.pop(0)
                                queue.size-=1
                                window_look_queue["-TABLELOOKQUEUE-"].update(queue.queue)
                            # ini logic ketika user klik Create receipt
                            elif event_look_queue == "-CREATERECEIPT-":
                                if not queue.size==0:  
                                    # ini layout receipt
                                    layout_receipt = [
                                        [sg.Multiline(no_scrollbar=True, size=(60, 10), key="-RECEIPTEND-")],
                                        [sg.B("Print Receipt", size=(25,1), key="-PRINTRECEIPT-", button_color="blue"), sg.B("Make a Wish", size=(25,1), key="-DONETRANSACTION-", button_color="green")]
                                    ]
                                    window_receipt = sg.Window("Receipt", layout_receipt, finalize=True)
                                    # ini untuk string barang
                                    queue_string = ""
                                    for index,barang in enumerate(queue.queue):
                                        nama_barang = barang[0]  # Mengambil hanya elemen pertama (nama buah)
                                        queue_string += f"{index+1}. {nama_barang} \n"

                                    # ini untuk receipt string yang mau di print nantinya
                                
                                    receipt_string = ("====================================================" "\n" + "======================RECEIPT=======================" + "\n" + "                           Jumlah produk : " + str(queue.size) + "\n" + "                           Total              : " + str(queue.total()) + "\n" + "=======================ITEM=========================" + "\n" + queue_string + "\n" + "====================================================")
                                    window_receipt["-RECEIPTEND-"].update(receipt_string)

                                    while True:
                                        event_receipt, values_receipt = window_receipt.read()
                                        if event_receipt in (sg.WINDOW_CLOSED, "-EXIT-") or event_receipt == "-DONETRANSACTION-":
                                            window_receipt.close()
                                            window_look_queue.close()
                                            window_selesai_memilih.close()
                                            queue.queue.clear()
                                            sg.popup("Berhasil di cetak!")
                                            queue.size=len(queue.queue)
                                            break
                                        # ini logic save as pdf receipt
                                        elif event_receipt == "-PRINTRECEIPT-":
                                            receipt_print_text = values_receipt["-RECEIPTEND-"]
                                            save_as_pdf(receipt_print_text)
                                            sg.popup("Berhasil di cetak!")
                                            queue.size=len(queue.queue)
                                else:
                                    sg.popup("Keranjang kosong")
        else:
            sg.popup("tambahkan data terlebih dahulu")
    elif event == "-GOTOLINK-":
        if values["-TABLE-"]:
            baris_terpilih = values["-TABLE-"][0]
            link_produk = list_search_barang[baris_terpilih][-1]
            webbrowser.open(link_produk)       
