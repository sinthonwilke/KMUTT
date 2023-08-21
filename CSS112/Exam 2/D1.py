#ตัวอย่าง
def append_to(element, to=[]):
    to.append(element)
    return to

print(append_to('something'))
print(append_to('something'))
print(append_to('something'))

print('\n', '*'*50, '\n')

#วิธีป้องกัน
def append_to(element, to=None): #default argument ของ to=None
    if to is None: #เช็ค to ถ้า to == None ก็สามารถเอา to ไปทำอะไรก็ได้
        to = []
    to.append(element)
    return to

print(append_to('something'))
print(append_to('something'))
print(append_to('something'))