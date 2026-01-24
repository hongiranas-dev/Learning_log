import numpy as np
#inserting values in specific index
arr=np.array([[1,2,3,4],
              [4,5,6,7]])
#rows
arr1=np.insert(arr,1,(3,3,3,3),axis=0)
print(np.insert(arr,1,(3,3,3,3),axis=0))
print("\n")
#deleting specific index
arr3=np.delete(arr,0,axis=0)
print(arr3)
#vstack(arr,arr1)
print("\n")
arr=np.array([1,2,3,4])
arr2=np.array([3,4,5,9])
#hstack(arr,arr1)
print("vstack ie row ",np.vstack((arr,arr2))) #append row wise
print("hstack clo wise",np.hstack((arr,arr2)))#append col wise
"""spliting the arrays"""
#normal split(arr,parts)
print("spliited",np.split(arr,2))
#hsplit() rows spliting
print("hsplit",np.hsplit(arr,2))
#vsplit() col
arr9=np.array([[1,2,3],
               [3,4,5]])
print("vsplit",np.vsplit(arr9,2))
#boardcasting
print("boarding casting")
print(arr)
print("boardcasting",arr+10)
#vectorsation
print(arr)
print(arr2)
a=np.array([[1,2,3],
            [5,6,7]])
b=np.array([[1,2,3],
            [5,6,7],
            [3,4,5]])
print("vectorization",a@b)
print("\n")
print("vect",arr+arr2)