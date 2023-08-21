inp = input().split()

for i in range(len(inp)):
    inp[i] = int(inp[i], 2)
    
print(bin(sum(inp))[2:])

