secret_letters = {
'.':'.',
'Amanda' : 'Doctor',
"haven't" : 'am',
'knew' : 'now',
'how' : 'in',
'joyous' : 'great',
'could' : 'threatening',
'be' : 'danger,',
'until' : 'please',
'saw' : 'need',
'face': 'help',
'leaps' : 'beats',
'hummingbird' : 'machine ',
'in':'very',
'flight' : 'alarmingly',
'time' : 'hour,',
'see' : 'need',
'you' : 'the drug',
'inspires' : 'causes',
}

letters = """Dear Amanda
 
I haven't knew how joyous life could be until I saw your face.
My heart leaps like a hummingbird in flight every time I see your face.
This is something I have never felt before, and it is you that inspires it."""

letters_list = letters.split()

for i in range(len(letters_list)):
    if letters_list[i] in secret_letters: letters_list[i] = secret_letters[letters_list[i]]


print(" ".join(letters_list))