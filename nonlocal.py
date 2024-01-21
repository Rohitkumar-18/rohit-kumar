a=10
def fun():
    c=20 
    def inner():
        nonlocal c
        c=40
        print(c)
    print(c)
    inner()
    print(c)
fun()       