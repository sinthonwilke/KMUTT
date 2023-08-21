import numpy as np
k = int(input())
c = np.ones((k,k),int)

c[::2, 1::2] = c[1::2, ::2] = 0
c = (c * np.arange(1,k+1)).T
print(c)