x = [i for i in input()]
if x[0] != x[1]: x[0] *= 2
for i in range(1, len(x)):
    if x[i] != x[i-1] and x[i] != x[i+1]: x[i] *= 2

print("".join(x))
