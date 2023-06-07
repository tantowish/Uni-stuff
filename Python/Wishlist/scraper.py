import requests 
import json

def get_params(keyword):
  params = []
  # Banyak halaman yang di ambil
  for i in range(1,10):
    param = "device=desktop&ob=23&page={}&q={}&related=true&rows=60&safe_search=false&scheme=https&shipping=&source=universe&srp_component_id=02.07.01.01&st=product&start={}&topads_bucket=true&unique_id=de15afea018010d9817f03a47b23b087&user_addressId=85584200&user_cityId=211&user_districtId=2848&user_id=67908625&user_lat=-7.3638102115068635&user_long=110.50366938114166&user_postCode=50733&user_warehouseId=0&variants=".format(i, keyword, (i - 1)*60)
    params.append(param)
  
  return params

# Method pengambilan data
def scrape_data(param,url,rating,seen_url):
  payload = [
  {
    "operationName": "SearchProductQueryV4",
    "variables": {
      "params": param
    },
    "query": "query SearchProductQueryV4($params: String!) {\n  ace_search_product_v4(params: $params) {\n    header {\n      totalData\n      totalDataText\n      processTime\n      responseCode\n      errorMessage\n      additionalParams\n      keywordProcess\n      componentId\n      __typename\n    }\n    data {\n      banner {\n        position\n        text\n        imageUrl\n        url\n        componentId\n        trackingOption\n        __typename\n      }\n      backendFilters\n      isQuerySafe\n      ticker {\n        text\n        query\n        typeId\n        componentId\n        trackingOption\n        __typename\n      }\n      redirection {\n        redirectUrl\n        departmentId\n        __typename\n      }\n      related {\n        position\n        trackingOption\n        relatedKeyword\n        otherRelated {\n          keyword\n          url\n          product {\n            id\n            name\n            price\n            imageUrl\n            rating\n            countReview\n            url\n            priceStr\n            wishlist\n            shop {\n              city\n              isOfficial\n              isPowerBadge\n              __typename\n            }\n            ads {\n              adsId: id\n              productClickUrl\n              productWishlistUrl\n              shopClickUrl\n              productViewUrl\n              __typename\n            }\n            badges {\n              title\n              imageUrl\n              show\n              __typename\n            }\n            ratingAverage\n            labelGroups {\n              position\n              type\n              title\n              url\n              __typename\n            }\n            componentId\n            __typename\n          }\n          componentId\n          __typename\n        }\n        __typename\n      }\n      suggestion {\n        currentKeyword\n        suggestion\n        suggestionCount\n        instead\n        insteadCount\n        query\n        text\n        componentId\n        trackingOption\n        __typename\n      }\n      products {\n        id\n        name\n        ads {\n          adsId: id\n          productClickUrl\n          productWishlistUrl\n          productViewUrl\n          __typename\n        }\n        badges {\n          title\n          imageUrl\n          show\n          __typename\n        }\n        category: departmentId\n        categoryBreadcrumb\n        categoryId\n        categoryName\n        countReview\n        customVideoURL\n        discountPercentage\n        gaKey\n        imageUrl\n        labelGroups {\n          position\n          title\n          type\n          url\n          __typename\n        }\n        originalPrice\n        price\n        priceRange\n        rating\n        ratingAverage\n        shop {\n          shopId: id\n          name\n          url\n          city\n          isOfficial\n          isPowerBadge\n          __typename\n        }\n        url\n        wishlist\n        sourceEngine: source_engine\n        __typename\n      }\n      violation {\n        headerText\n        descriptionText\n        imageURL\n        ctaURL\n        ctaApplink\n        buttonText\n        buttonType\n        __typename\n      }\n      __typename\n    }\n    __typename\n  }\n}\n"
  }
  ]

  r = requests.post(url,json = payload).json()
  rows = r[0]['data']['ace_search_product_v4']['data']['products']

  data_scrape = [] # Data mentah tanpa di filter
  hartot=0
  for i in range(0, len(rows)):
    product_name = rows[i]['name']
    price = rows[i]['price']
    product_rating = rows[i]['ratingAverage']
    product_seller = rows[i]['shop']['name']
    product_location = rows[i]['shop']['city']
    product_url = rows[i]['url']
    data_scrape.append(
      (product_name, price, product_rating, product_seller, product_location,product_url)
    )

    numeric_string = ''.join(filter(str.isdigit, price))
    harga = int(numeric_string)
    hartot+=harga
  avg = hartot/len(data_scrape)
  data_filtered = [] # Data that is filtered

  for i in range(len(data_scrape)):
      numeric_string = ''.join(filter(str.isdigit, data_scrape[i][1]))
      harga = int(numeric_string)
      
      # Filter prices that are less than the average and greater than 40% of the original price, and have a rating
      if harga < avg and harga > 0.4 * hartot / len(data_scrape) and data_scrape[i][2].strip():
          if float(data_scrape[i][2]) >= rating:
              if data_scrape[i][5] in seen_url:
                  break
              else:
                  data_filtered.append(data_scrape[i])
                  seen_url.append(data_scrape[i][5])
  return data_filtered
