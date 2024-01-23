def fact(a,out=1):
    if a==1:
       return out
    
    out*=a
    return fact(a-1,out)
print(fact(5))