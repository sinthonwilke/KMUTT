r, c = [int(i) for i in input().split()]
rc_matrix = []

for i in range(r):
    c_input = [int(i) for i in input().split()]
    if len(c_input) == c: rc_matrix.append(c_input)
    else: rc_matrix.append([])

print(rc_matrix)