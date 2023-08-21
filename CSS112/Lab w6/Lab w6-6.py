n = int(input())
name_dept_dict = {}

for i in range(n):
    name, dept = input().split()
    if dept in name_dept_dict: name_dept_dict[dept].add(name)
    else: name_dept_dict[dept] = {name}

find = input().split()
ans = set()
for i in find:
    if i in name_dept_dict:
        ans = ans.union(name_dept_dict[i])

print(" ".join(sorted(ans)))