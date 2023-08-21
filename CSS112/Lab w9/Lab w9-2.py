import numpy as np
k = int(input())

m = np.ones((3, 3), int)
print("Befor:\n", m)
m[::k, ::k] *= 2
print("After:\n", m)


