a= [['k' ,[1,2,3]],
    ['j',[-1,-2,-3,-4]],
    ['m',[]]]
a_dict = {key: value for (key, value) in a if value}

print(a_dict)