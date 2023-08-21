d, n = [int(i) for i in input().split()]

if len(str(d)) < n: ans = "0" * (n - len(str(d))) + str(d)
else: ans = d

print(ans)