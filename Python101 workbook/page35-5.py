a,b = [int(e) for e in input().split()]
s = 0
for i in range(a,b):
    for j in range(i+1,b+1):
        s += (-1)**i * (i+j)
print(s)