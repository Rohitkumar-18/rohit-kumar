def fib(a,b=0,c=1,out=()):
    if c>=a:
        return out
    elif b==0:
        out+=(b,c)
    else:
        out+=(c,)
    return fib(a,c,b+c,out)
print(fib(100))  
print(fib(50))
print(fib(25))