##################################################
#input
"""
10
Robert Dick
William Bill
James Jim
John Jack
Margaret Peggy
Edward Ed
Sarah Sally
Andrew Andy
Anthony Tony
Deborah Debbie
4
John
Jim
Don
Debbie
"""
##################################################


n = int(input())
name_dict = dict(input().split() for i in range(n))
n = int(input())
ans_list = list()
for i in range(n):
    inp = input()
    for key, value in name_dict.items():
        if inp == key: ans_list.append(value)
        elif inp == value : ans_list.append(key)
    if len(ans_list) != i+1:
        ans_list.append("Not found")


print("\n")
print("\n".join(ans_list))