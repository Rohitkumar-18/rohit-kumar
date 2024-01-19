string=input('entera string')
out= ' '
res=' '
for char in string:
    if char not in out:
       out=out+char
    else:
        res+=char   
print(res) 

