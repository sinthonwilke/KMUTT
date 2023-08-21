subtract = False
x = 0
for i in range(1, 3999999+1, 2):
    if subtract : x -= (1/i); subtract = False
    else: x += (1/i); subtract = True
x *= 4

print(x)