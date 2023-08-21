k = 0
x = 1
while True:
    x *= (365 - k) / 365 
    if 1 - x >= 0.5: print(k); break
    k += 1