def reverse(d):
    reverse_d = {value: key for key, value in d.items()}
    return reverse_d


def keys(d, v):
    ans = [key for key, value in d.items() if value == v]
    return ans

print(reverse({3:"A", 2:"B"}) == {"A":3, "B":2})
print(keys({3:33, 4:33, 5:55, 2:33}, 33))
print(keys({3:33, 4:33, 5:55, 2:33}, 9999)) 