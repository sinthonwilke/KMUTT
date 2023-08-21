import numpy as np
k = int(input())
c = np.ones((k,k),int)

c[::2, ::2] = c[1::2, 1::2] = 0
print(c)







