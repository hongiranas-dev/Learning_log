import pandas as pd

#creating df and contverting it csv,json
df=pd.DataFrame({"name":["asha","uma","parvathi"],
                 "marks:":[99,100,92]})
df.to_excel("output.xlsx")


#import the files from xlsx,csv,json
df=pd.read_excel(r"output.xlsx")

#df=pd,read_csv(r"path.csv",encoding="utf-8 or ")latin1
df.to_csv("marks.csv")
print(pd.read_csv("marks.csv")) 

 
