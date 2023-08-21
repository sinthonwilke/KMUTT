n = int(input())
n_list = []
for i in range(n):
    n_list.append(int(input()))
n_list.sort()
print(n_list[len(n_list) - 1] - n_list[0], len([i for i in n_list if i < 0]))