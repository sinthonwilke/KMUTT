x = str(input())

ans = 0
for i in x:
    if "0" <= i <= "9" and int(i) % 2 != 0: ans += 1

print(ans)