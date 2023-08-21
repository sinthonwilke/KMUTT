inp = [int(i) for i in input().split()]
inp.sort()

midPos = (len(inp) - 1) // 2

if len(inp) % 2 == 0: print((inp[midPos] + inp[midPos + 1]) / 2)
else: print(inp[midPos])

print(inp)