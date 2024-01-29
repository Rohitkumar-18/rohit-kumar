def sample(a):
    return a**2
def fun(f):
    def inner(a):
        print('execution started')
        return f(a)
    return inner
sample=fun(sample)
print(sample(5))