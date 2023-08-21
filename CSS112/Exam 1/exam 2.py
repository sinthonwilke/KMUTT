str_list = [i for i in input()]                     #input = Being with you I reign in university, the sporty look of mine energize my list. I am going outing in university email
num_list = [int(i) for i in input().split(",")]     #input = 0,12,5,4,1,1,1,1,1,6,4,1,1,1,1,1,1,1,4,1,6,1,1,6,1,1,7,1,1,2,1,3,3,1,8,1,3,1,1,4,6
x = 0
ans = ""
for i in num_list:
    x += i
    ans += str_list[x]

print(ans)