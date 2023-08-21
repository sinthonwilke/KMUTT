inp = int(input()) #input any int number
x = []

for k in range(2, inp//2):
    for n in range(2*k, inp, k):
        x.append(n)

x.sort()
y = []
for i in range(len(x) - 1):
    if x[i] != x[i+1]: y.append(x[i])
y.append(x[-1])

print(y)

