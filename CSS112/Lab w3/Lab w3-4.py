ans = input()
student_ans = input()

score = 0
if len(ans) == len(student_ans):
    for i in range(len(ans)):
        if student_ans[i] == ans[i]:
            score += 1
    print(score)
else: print("Incomplete answer")

