import webbrowser
import scraper
import pandas as pd
import urllib.parse
import PySimpleGUI as sg
import Queue
import Stack
import os

def search(keyword, rating):
    url = 'https://gql.tokopedia.com/graphql/SearchProductQueryV4'
    params = scraper.get_params(urllib.parse.quote(keyword))
    data = []
    for i in range(0, len(params)):
        param = params[i]
        data_scrap = scraper.scrape_data(param,url,rating)
        data.extend(data_scrap)

    # Visualisasi excel atau xlsx
    # df = pd.DataFrame(all_data, columns = ['Nama Produk', 'Harga Produk', 'Rating', 'Penjual', 'Lokasi','url','discount'])
    # df.to_excel(keyword+'_data.xlsx', index = False)
    # print("Data berhasil disimpan ke Excel")
    # Define the table

    # Sorting data dari termurah ke termahal
    data_sorted = list(data)
    n = len(data_sorted)
    for i in range(n):
        for j in range(0, n-i-1):
            numeric_string = ''.join(filter(str.isdigit, data_sorted[j][1]));harga1 = int(numeric_string)
            numeric_string = ''.join(filter(str.isdigit, data_sorted[j+1][1]));harga2 = int(numeric_string)
            if harga1 > harga2:
                data_sorted[j], data_sorted[j+1] = data_sorted[j+1], data_sorted[j]

    return data_sorted[0:10] # Bates 10 teratas aja

# method buat mulai program, isinya menu, trus looping search->add keranjang sampe user selesai
def inputs():
    menu=0
    while(menu!=3):
        keyword = input('Barang yang dicari : ')
        rating = float(input('Rating minimal : '))
        data_sorted = search(keyword,rating)
        for i in range(len(data_sorted)):
            print(str(i+1)+".",data_sorted[i])

        print("\nPilih Item : ",end="")
        item=int(input())

        print("\n\nCeritanya button dil")
        print("1. add")
        print("2. Lihat keranjang")
        print("3. Selesai")
        pilih=int(input("Action : "))
        if(pilih==1):
            keranjang.push(data_sorted[item-1])
            print("Item ditambahkan ke keranjang")
        elif(pilih==2):
            keranjang.displayRev()
        elif(pilih==3):
            antrian()
            menu=3
        print()
    
# Method setelah user selesai add keranjang
def antrian():
    os.system('cls')
    keranjang.displayRev()
    print("\nCeritanya button dil")
    print("1. Tambahkan ke antrian wish list")
    print("2. Mengubah urutan")
    pilih = int(input("Pilihan : "))
    if(pilih==1):
        addQueue() # Ketika user tidak ingin mengubah urutan
    elif(pilih==2):
        orderQueue() # Ketika user ingin mengubah urutan

# Masukin dari keranjang stack ke antrian queue langsung
def addQueue():
    for i in range(keranjang.size):
        queue.push(keranjang.top())
        keranjang.pop()
    print()
    receipt()

# Masukin dari keranjang stack ke antrian queue, user memilih yang mana yang masuk antrian duluan
def orderQueue():
    for i in range(keranjang.size):
        print()
        keranjang.displayRev()
        urutan = int(input("\nPilih produk untuk urutan ke-"+str(i+1)+" : "))
        print(keranjang.size,keranjang.size-urutan)
        queue.push(keranjang.stack[keranjang.size-urutan])
        keranjang.stack.pop(keranjang.size-urutan)
        keranjang.size-=1
    print("ini queue nya:", queue.queue)
    # receipt()

def receipt():
    os.system('cls')
    queue.display()
    print("\n==========================================")
    print("=================RECEIPT==================")
    print("\tJumlah produk :",queue.size)
    print("\tTotal         :", queue.total())

    print("\nCeritanya tombol cetak pdf dil")
    cetak = input("Cetak ?")
    if(cetak.lower()=="cetak"):
        print("Alogritma List to PDF, nanti tak tambahin dil santuy")



queue = Queue.Queue()
keranjang = Stack.Stack()
inputs()
print(queue.queue)






# Define the table layout
# layout = [
#     [sg.Table(values=data_sorted, headings=['Product', 'Price', 'Rating', 'Seller', 'Location', 'URL'],
#     max_col_width=30, auto_size_columns=True, justification='center', enable_events=True, num_rows=20, key='-TABLE-', bind_return_key=True, tooltip='Click to open URL')],
#     [sg.Button("Open Last Link")]
# ]

# # Create the window
# window = sg.Window("Table Example", layout)

# # Event loop
# while True:
#     event, values = window.read()
#     if event == sg.WINDOW_CLOSED:
#         break
#     elif event == "-TABLE-":
#         selected_row = values["-TABLE-"][0]
#         link = data_sorted[selected_row][-1]
#         webbrowser.open(link)

# # Close the window
# window.close()