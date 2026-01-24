"""Create a 3×4 array with values 1–12 and print:
ndim
shape
size
dtype"""
import numpy as np
arr=np.arange(1,13)
arr_reshape=arr.reshape(3,4)
print("ndim",arr_reshape.ndim)
print("shape",arr_reshape.shape)
print("size",arr_reshape.size)
print("dtype",arr_reshape.dtype)
#Create a 1D array of 100 equally spaced values between −1 and 1.
print("\n")
arr=np.linspace(-1,1,100)
print(arr)
#Create a 4×4 identity matrix.
print("\n")
arr=np.eye(4,4)
print(arr)
#Generate numbers 1–30 and reshape to (5,6).
print("\n")
arr=np.arange(1,31)
arr2=arr.reshape(5,6)
print(arr2)
#Convert that array to 1D using flatten().
print("\n")
arr1=arr.flatten()
print(arr1)
"using ravel"
print("\n")
arr1=arr.ravel()
print(arr1)
#Explain why reshape(7,7) fails for 49 elements(i dont kn)
print("\n")
arr=np.arange(1,50)
arr1=arr.reshape(7,7)
print(arr1)
#Q7. Extract the middle 3×3.
arr=np.arange(1,26).reshape(5,5)
print("\n")
print(arr[1:4,1:4])
#Q8. Extract all even-indexed rows and odd-indexed columns
print("\n")
print(arr[::2],arr[1:5:2])# i dont kn
#Q9. Extract last two columns.
print("\n")
print(arr[0:5,3::])
#Q10. Keep only values between 0 and 50
print("\n")
arr = np.array([10, -2, 25, 0, 55, -10, 8, 101])
print(arr[0<arr] & arr[arr<50])# error
#Q11. Replace negatives with absolute values.
print("\n")
arr[arr<0]=np.abs(arr[arr<0])
print(arr)# i dont know
#Q12. Replace values > 80 with exactly 80..
print("\n")
arr[arr>80]=80
print(arr)
# Q13. Compute: mean, median, std, var, sum.
print("\n")
marks=np.array([1,23,4,5])
print(np.mean(marks))
print(np.median(marks))
print(np.std(marks))
print(np.var(marks))
print(np.sum(marks))
#i dont know
#Q14. Normalize values between 0 and 1.
#(x - min) / (max - min)
norm=(marks-np.min(marks))-(marks-np.marks(max))/(np.max(marks)-np.min(marks))
print(norm)
#Q15. Standardize: (x − mean) / std.
std=marks-np.mean(marks)/np.std(marks)
print(std)
