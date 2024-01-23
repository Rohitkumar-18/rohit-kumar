a=[9,'a',10,[1,3],'234',21,22.5]
out=[(i,a[i]) for i in range(len(a)) if isinstance(a[i],int)]
print(out)