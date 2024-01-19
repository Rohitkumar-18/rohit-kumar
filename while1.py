a=input('enter a string')
i=0
out=" "
temp= True
while i<len(a):
    if a[i]==' ':  
        temp=True 
    elif temp and 'a'<=a[i]<='z':
        out+=chr(ord(a[i])-32)
        temp=False
    else:
         out+=a[i]  
         temp=False   
    i+=1   
print(out)       