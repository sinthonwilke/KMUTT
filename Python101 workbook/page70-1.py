v1 = [int(i) for i in input().split(' ')]
v2 = [int(i) for i in input().split(' ')]

if len(v1) == len(v2):
    dot_product = sum([v1[i] * v2[i] for i in range(len(v1))])
    print(dot_product)
else: print('Error')
