inp = float(input())
grade = ""
if 80 <= inp <= 100: grade = "A"
elif 75 <= inp < 80: grade = "B+"
elif 70 <= inp < 75: grade = "B"
elif 65 <= inp < 70: grade = "C+"
elif 60 <= inp < 65: grade = "C"
elif 55 <= inp < 60: grade = "D+"
elif 50 <= inp < 55: grade = "D"
elif 0 <= inp < 50: grade = "F"
else: grade = "ERROR"

print(grade)