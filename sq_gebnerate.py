def fun(n):
    a,b=0,1
    for i in range (n):
        a=b
        yield a
        b=a+b
out=fun(10)
print(list(out))