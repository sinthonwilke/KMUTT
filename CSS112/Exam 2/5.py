animals = ['dogs','cats','birds','insects','rats']
inbox1 = ['cars', 'keys', 'computers']
inbox2 =['chairs', 'cats', 'water']

def check_animals(box):
    x = []
    for item in box:
        if item in animals:
            x.append(item)

    if len(x) == 0:
        x = 'not found'
    return x



kk=check_animals(inbox2)
print(kk)

kk=check_animals(inbox1)
print(kk)
