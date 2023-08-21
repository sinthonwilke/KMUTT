x = int(input())

#from a^2 = b^2 + c^2
#find a max

a_max = 0

for b in range(1, x//2):
    for c in range(1, x//2):
        a = x-(b+c)
        if a**2 == b**2 + c**2:
            if a > a_max: a_max = a

print(a_max)