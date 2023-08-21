x = []
while True:
    inp = float(input())
    if inp == -1: break
    else: x.append(inp)
print(sum(x) / len(x)) if len(x) != 0 else print("No Data")