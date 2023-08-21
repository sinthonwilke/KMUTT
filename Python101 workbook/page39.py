inp = int(input())
ans = [i for i in range(1, inp) if i % 3 == 0 or i % 5 == 0]
print(sum(ans))
