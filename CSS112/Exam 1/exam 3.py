str_list1 = [i for i in input()] #input = Being with you I reign in university, the sporty look of mine energize my list. I am going outing in university email
str_list2 = [i for i in input()] #input = Born in us, the spy of enemy is amoung us

ans = []
x = -1

for i in range(len(str_list2)):
    for j in range(len(str_list1)):
        if str_list2[i] == str_list1[j] and j > x:
            ans.append(j - x)
            x = j
            break
            
print(ans)




"""Being with you I reign in university, the sporty look of mine energize my list. I am going outing in university email"""
"""Born in us, the spy of enemy is amoung us"""
"""0,12,5,1,1,1,1,6,4,1,1,1,1,1,1,1,5,1,6,1,1,6,1,1,7,1,1,2,1,6,1,8,1,3,1,1,4,6"""

"""Being with you I reign in university, the sporty look of mine energize my list. I am going outing in university email"""
"""Being in us, the port of energy is out in universe"""
"""[0,1,1,1,1,1,18,1,1,1,6,4,1,1,1,1,1,2,1,1,1,2,6,1,1,6,1,1,1,1,6,1,2,1,1,3,8,1,2,7,1,1,1]"""