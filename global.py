a=10
def fun():
    global a
    a=40
    print(a)
print(a)
fun()
print(a)    