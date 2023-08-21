num = input()

a = float(num)
b = 0

min = 0
max = float(a)
b = (max + min) / 2

while True:
    if round(10**b, 6) == a: break

    if 10**b > a: max = b
    else : min = b
    b = (max + min) / 2

print(round(b, 6))