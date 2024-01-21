a=10
def fun():
    c=20 
    def inner():
        print(a)
        print(c)
    print(c)
fun()       