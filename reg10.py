import re
with open(r"D:\mcasec_b\viratt.txt",'r+') as file:
    data=file.read()
    newdata=re.sub(' ','_',data)
    file.seek(0)
    file.write(newdata)
print(newdata)    