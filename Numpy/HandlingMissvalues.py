import numpy as np    
#np.isnan(arr)
arr=np.array([1,2,np.nan,3,np.nan])
print(np.isnan(arr))
#nan_to_num
print(np.nan_to_num(arr,nan=100))
#checking infinity valus by np.isinf(arr)
arr2=np.array([1,2,np.inf,3,np.inf])
print(np.isinf(arr2))
#replacing infinity values
print(np.nan_to_num(arr2,posinf=2,neginf=9))