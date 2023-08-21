n = int(input())
for x in range(1, n+1):
    for y in range(x, n+1):
        for z in range(y, n+1):
            t = x**2 + y**2 + z**2
            w = int(round(t**(1/3),0))
            if w**3 == t:
                print(w,x,y,z)