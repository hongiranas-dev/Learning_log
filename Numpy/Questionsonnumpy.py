"""Q1.Create a 1D array with values 1 to 20.
Print:
shape
ndim
size
dtype"""
import numpy as np
arr=np.arange(1,21)
print(arr.shape)
print(arr.ndim)
print(arr.size)
print(arr.dtype)
"""Reshape the above array into:
4×5
then into 5×4
Explain (in comments) why both work."""
print(arr.reshape(4,5))
print(arr.reshape(5,4))#bcs the total elements are 20
"""Q3. Extract:
first row
last column
middle 3×3"""
arr = np.arange(1,26).reshape(5,5)
print(arr[0])
print(arr[0:5,4])
print(arr[1:4,1:4])
"""Q4.
Extract:
all even-indexed rows
all odd-indexed columns"""
print(arr[::2,1::2])
"""Q5.keep only positive values
replace negatives with 0"""
data = np.array([12, -5, 0, 45, 99, -20, 33, 60])
data[data<0]=0
print("sorted",data)
"""Q6.keep values between 10 and 50 
cap all values > 50 to exactly 50"""
print(data[(data>10) & (data<50)])
data[data>50]=50
print(data)
"""Q7.
total marks per student
average marks per subject
"""
marks = np.array([
    [78, 85, 90],
    [60, 55, 70],
    [92, 88, 95],
    [40, 45, 50]
])
print("tot marks",np.sum(marks,axis=1))
print("avg per sub",np.mean(marks,axis=0))
"""Q8.
Flatten the above marks array."""
print(marks.flatten())
"""Q9.
Reshape it into a 6×2 matrix.
Explain why this works."""
print(marks.reshape(6,2))#since it has 12 elements
"""Q10.Compute:
mean,median,standard deviation,min,max"""
scores = np.array([56, 72, 90, 45, 66, 88, 39])
print(np.mean(scores))
print(np.median(scores))
print(np.std(scores))
print(np.min(scores))
print(np.max(scores))
"""Q11.
Normalize scores between 0 and 1 using:(x - min) / (max - min)
"""
print((scores-np.min(scores))/(np.max(scores)-np.min(scores)))
"""Q12.
Standardize scores using: (x - mean) / std"""
print((scores-np.mean(scores))/(np.std(scores)))
"""Q13.
Add bias to arr using broadcasting.
Explain why this works in one comment."""
arr = np.array([
    [1,2,3],
    [4,5,6]
])
bias = np.array([10, 20, 30])
print(arr+bias)# since 3 columns
"""Q14.
insert a row of zeros at index 1
delete column at index 2"""
arr = np.arange(1,13).reshape(3,4)
print(np.insert(arr,1,[0,0,0,0],axis=0))
print(np.delete(arr,2,axis=1))#forgot the syntax
"""Q15.
In your own words (as comments) answer:
Why is NumPy required before Pandas?"""
#we do data anaylisis using numpy and panda where in order to work with the data set
#numpy and panda goes hand in hand..as numpy provide to work iwth arrays and do 
# statical operation and panda for arranging the data in tabular formsets