a='roopa'
i=0
out=[]
while i<len(a):
    if a[i] in 'aeiouAEIOU':
        out=out+[i]
    i+=1
print(out)    
