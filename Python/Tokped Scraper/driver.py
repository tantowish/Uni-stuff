import scraper
import pandas as pd
import urllib.parse

url = 'https://gql.tokopedia.com/graphql/SearchProductQueryV4'
keyword = input('Barang yang dicari : ')
rating = float(input('Rating minimal : '))
condition = "baru"
params = scraper.get_params(urllib.parse.quote(keyword))
all_data = []
for i in range(0, len(params)):
    param = params[i]
    data = scraper.scrape_data(param,url,rating)
    all_data.extend(data)

df = pd.DataFrame(all_data, columns = ['Nama Produk', 'Harga Produk', 'Rating', 'Penjual', 'Lokasi','url'])
df.to_excel(keyword+'_data.xlsx', index = False)
print("Data berhasil disimpan ke Excel")
