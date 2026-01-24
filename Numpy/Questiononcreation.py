#Create a NumPy array: [10, 20, 30, 40, 50]
import numpy as np
arr=np.array([10, 20, 30, 40, 50])
print(arr)
print("\n")
#Create an array from 1 to 30 with step = 3.
arr=np.arange(1,31,3)
print(arr)
print("\n")
#Create an array of 50 equally spaced values between 0 and 1.
arr=np.linspace(0,1,50)
print(arr)
print("\n")
#Create a float array and convert its dtype to int.
arr=np.array([10.0, 20.0, 30.0, 40.0, 50.0])
arr2=arr.astype(int)
print(arr2)
print("\n")
arr = np.linspace(0, 1, 50)
print(arr)
print("\n")

