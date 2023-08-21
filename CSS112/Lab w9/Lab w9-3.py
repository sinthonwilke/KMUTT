import numpy as np
m = np.array([[3,2],
              [5,6],
              [7,1]])

mx = np.max(m,axis=0)
mn = np.min(m,axis=0)
print(mx - mn)