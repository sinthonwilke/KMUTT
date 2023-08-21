n = int(input()) #input any int number

x = [j for k in range(2, n//2) for j in range(2*k, n, k)]
x.sort()

y = [x[i] for i in range(len(x) - 1) if x[i] != x[i+1]]
y.append(x[-1])

z = [i for i in range(2, n-1) if i not in x]

print("x =", x,"\ny =", y,"\nz =", z)
