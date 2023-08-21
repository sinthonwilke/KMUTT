x = str(input())
x_dict = dict((i, x.count(i)) for i in x)
print(x_dict)