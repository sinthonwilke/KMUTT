num_str = input()
num_list = ["0","1","2","3","4","5","6","7","8","9"]

for i in num_str:
    if i in num_list:
        num_list.remove(i)

if len(num_list) != 0: print(",".join(num_list))
else: print("None")