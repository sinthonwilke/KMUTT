a,b = [int(i) for i in input().split()]
ans = 0
for i in range(a, b):
    sum = 0
    for j in range(i+1, b+1):
        sum += i + j
    ans += (-1)**i * sum
print(sum)