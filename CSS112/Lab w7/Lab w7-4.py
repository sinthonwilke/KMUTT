###
"""
5
Magnum 50
Cornetto 25
PaddlePop 15
AsianDelight 20
Calippo 15
3
Cookie 20
MamaTomYum 3
MangoSheet 10
"""
###
"""
5
Magnum 50
Cornetto 25
PaddlePop 15
AsianDelight 20
Calippo 15
6
Magnum 5
Magnum 5
Cookie 20
MamaTomYum 3
Cornetto 20
AsianDelight 1
"""
###


n = int(input())
price_dict = dict(input().split() for i in range(n))
n = int(input())
sale_dict = dict()


sum = 0
for i in range(n):
    icecream, sale = input().split()
    if (icecream not in sale_dict) and (icecream in price_dict):
        sale_dict.update({icecream : int(price_dict[icecream]) * int(sale)})
        sum += int(price_dict[icecream]) * int(sale)
    elif (icecream in sale_dict) and (icecream in price_dict):
        sale_dict[icecream] += int(price_dict[icecream]) * int(sale)
        sum += int(price_dict[icecream]) * int(sale)


if sum == 0:
    print("No icecream sales")
else:
    sale_list = [[value, key] for key, value in sale_dict.items()]
    mx = max(sale_list)[0]
    mx_list = list()
    for sales, icecream in sale_list:
        if sales == mx: mx_list.append(icecream)
    mx_list.sort()
    print("Total ice cream sales:", sum)
    print("Top sales:", ", ".join(mx_list))
    
