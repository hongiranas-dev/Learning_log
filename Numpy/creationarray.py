import numpy as np
#creating array from list and tuple
arr=np.array([[1,2,3],
              (1,2,3)])
print(arr)
print()
#creating array from deafault values
#np.zeroes(shape,dtype)
arr_zeroes=np.zeros((2,2),dtype='int')
print(arr_zeroes)# 2d array
print("@\n")
#3d array
arr_zeroes1=np.zeros((3,2,2),dtype='int')
print(arr_zeroes1)
print("$\n")

#array with ones
#np.ones(shape,dtype)
arr_ones=np.ones(2)
print(arr_ones)
print("@\n")
arr_ones=np.ones((2,3))
print(arr_ones)
print("@\n")

#array with full of user inputs
#arr=np.full(shape,value)
arr_full=np.full((1,2,3),7.0)
print(arr_full)
print("#\n")
print("\n")
arr_full=np.full((2,2,3),7.0)
print(arr_full)
print("#\n")

