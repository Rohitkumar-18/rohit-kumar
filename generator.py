def fun(a,b):
    yield a+b
    yield a*b
out=fun(3,2)
print(list(out))