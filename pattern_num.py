a= 'meet**ca*e'
i=0
while i<len(a) and '*' in a:
    if a[i]=='*':
        a=a[:i-1]+a[i+1:]
        i-=1
        continue
    i+=1
print(a)    