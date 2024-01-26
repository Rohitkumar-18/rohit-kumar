file=open(r"indexing.txt",'r')
data=file.read()
print(data)
file.close()
import re
data=re.findall('aeiouAEIOU',r"indexing.py")
print(data)
(function) def (print
               *