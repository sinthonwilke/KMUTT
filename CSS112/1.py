no_subjects = int(input())

subject_room = [input().split() for i in range(no_subjects)]
subject_room = [[i, int(j)] for i,j in subject_room]

room_left = dict(subject_room)
no_students = int(input())

student_regs = [input().split() for i in range(no_students)]
student_regs = [[i, float(j), k] for i,j,*k in student_regs]

sorted_student_regs = sorted(student_regs,key=(lambda i: i[1]), reverse=True)


match = []
for id, grade, subjects in sorted_student_regs:
    for subject in subjects:
        if(room_left[subject] > 0):
            amatch = dict()
            amatch['id'] = id
            amatch['subject'] = subject
            match.append(amatch)
            room_left[subject] -= 1
            break


print(match)
sorted_match = sorted(match, key=(lambda i:i['id']))
for i in sorted_match:
    print(f"{i['id']} {i['subject']}")
