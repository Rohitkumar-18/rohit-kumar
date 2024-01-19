st=input('enter a string')
out=[]
i=0
temp=' '
while i<len(st):
    if st[i]!=' ':
         temp+=st[i]
    else:     
       out+=[temp]
       temp=' '
    i+=1
else:   
    if temp:
       out+=[temp]
print(out)        