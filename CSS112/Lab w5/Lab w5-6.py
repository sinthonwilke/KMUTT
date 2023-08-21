x = [int(i) for i in input().split()] #input = 1 2 3
y = [int(i) for i in input().split()] #input = 3 2 1

ans = [x[i] + y[i] for i in range(len(x))]
print(ans)