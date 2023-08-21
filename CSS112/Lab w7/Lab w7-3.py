#input = AaBbbbbbbCcDddd


str_input = [i for i in input().lower() if 'a' <= i.lower() <= 'z']
ans_dict = dict()
for i in str_input:
    if i in ans_dict: ans_dict[i] += 1
    else: ans_dict.update({i:1})

ans_list = [[value, key] for key, value in ans_dict.items()]
ans_list.sort(reverse = True, key = lambda x: x[0])

for num, char in ans_list:
    print(char, "->", num)