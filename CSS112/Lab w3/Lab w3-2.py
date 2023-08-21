value_list = []
while True:
    value = input()
    if (value != "q"):
        value_list.append(float(value))
    else: break

if len(value_list) != 0:
    mean = sum(value_list) / len(value_list)
    print(round(mean, 2))
else: print("No Data")