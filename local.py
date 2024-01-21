a=10
def fun():
    c=20 
    def inner():
        c=40
        print(a)
        print(c)
    print(c)
    inner()
    print(c)
fun()       