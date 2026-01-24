#performing the artibutes of array operations
import numpy as np
arr=np.array([[1,2,3],[4,5,6]])
print("dimension",arr.ndim)
print("rows and columns",arr.shape)
print("total number of elemnts",arr.size)
print("dtype",arr.dtype)
arr2=arr.reshape(1,6)
print(arr)
print("row",arr.sum(axis=0)) #row
print("indexing",arr[0,1])
print(np.delete(arr,0))
