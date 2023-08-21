x = [int(i) for i in input().split()] #input = -2 -1 -1 0 1 2 2 3

#1
x.sort()

#2
y = []
for i in range(len(x) - 1):
    if x[i] != x[i+1]: y.append(x[i])

#3
y.append(x[-1])


print(y)