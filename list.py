def split(a):
    out=[]
    i=0
    while i<len(a):
        out+=a[i]
        i+=1
    return out
print(split(['abcd',[1,2,3]]))           
