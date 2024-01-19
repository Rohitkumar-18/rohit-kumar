a='good morning'
out=[]
for i in range(len(a)):
    if a[i] in 'aeiouAEIOU':
        out+=[i]
print(out)                
