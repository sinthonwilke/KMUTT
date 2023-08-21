inp = "Test, เทส, 123" #input here
x = "".join([i for i in inp if "a" <= i.lower() <= 'z'])
print(x)