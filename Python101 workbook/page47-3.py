x = [i for i in input()]
y = [i for i in x[::-1]]

correct_check = 0
for i in range(len(x)):
    if x[i] == y[i]: correct_check += 1

print("Yes") if correct_check == len(x) else print("No")