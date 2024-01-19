a=input('enter a string')
i=0
out=" "
while i<len(a):
    if 'a'<=a[i]<='z':
        out+=chr(ord(a[i])-32)
    else:
        out+=a[i]
    i+=1
print(out)    