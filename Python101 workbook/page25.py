inp = [int(i) for i in input().split()]
inp[1] = inp[1] - 543
february = 29 if inp[1] % 4 == 0 and inp[1] % 100 != 0 else 28
monthsDays_list = [31,february,31,30,31,30,31,31,30,31,30,31]

print(monthsDays_list[inp[0] - 1])