a = int(input())

x = "Not Found"
for i in range(abs(a)+1):
    if i**3 == abs(a): x = i if a >= 0 else -1 * i

print(x)