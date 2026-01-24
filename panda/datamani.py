import pandas as pd
df=pd.read_csv(r"C:\Users\HP\Downloads\Iris.csv",encoding="utf-8")
#exracting single column from dataframe
print("series from a datframe")
print(df["SepalLengthCm"])
print()
#extratcing multiple columns from a dataframe
print("acessing multiple dataframe")
print(df[["SepalLengthCm","Species"]])
print()
#extracting rows based on condition
print("accesing mutliple coloumns")
print("sepla length more than 5")
print(df[df["SepalLengthCm"]>5])
print()
#extracting rows with multiple condition
print("data with greater  sepallength than 5 and PetalLengthCm>2")
print(df[(df["SepalLengthCm"]>5) & (df["PetalLengthCm"]>2)])
#using or condition
c_or=df[(df["SepalLengthCm"]>6) | (df["PetalLengthCm"]>5)]
print(c_or)
print("is it printing or not")
df["names"]="flowery loveS you"
print(df)
print(df["names"].str.lower())
#data cleaning
