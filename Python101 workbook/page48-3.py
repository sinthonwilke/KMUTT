x = str(input())
#ab123s45dd6789ccc = 4
char_cout = 0
for i in range(len(x) - 1):
    if "a" <= x[i].lower() <= "z" and  "a" <= x[i+1].lower() <= "z":
        char_cout += 1
print(char_cout)