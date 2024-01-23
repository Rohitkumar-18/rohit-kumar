def fact(num):
    out=1
    for i in range(1,num+1):
       out*=i
    return out 
out=[fact(i) for i in range(1,11) if i%2==0]
print(out)

    
