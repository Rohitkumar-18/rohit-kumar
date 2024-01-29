def sample(a):
    return a**2
def fun(f):
    def inner(a):
        return f(a)
    return inner
sample=fun(sample)
print(sample)