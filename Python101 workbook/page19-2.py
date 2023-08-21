from math import sqrt

inp1 = [float(i) for i in input().split()]
inp2 = [float(i) for i in input().split()]

distance = sqrt((inp1[0]-inp2[0])**2 + (inp1[1]-inp2[1])**2)

if inp1[2] + inp2[2] == distance: print("touch")
elif inp1[2] + inp2[2] >= distance: print("overlap")
else: print("free")