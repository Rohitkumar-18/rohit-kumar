class Add:
    @staticmethod
    def add2(a,b):
        return a+b
    @staticmethod
    def add3(a,b,c):
        return a+b+c
class Sub:
    @staticmethod
    def sub2(a,b):
        return a-b
class Mul:
    @staticmethod
    def Mul2(a,b):
        return a*b
class Cal(Add,Sub,Mul):
      pass
obj=Cal()
print(obj.add2(3,4))
print(obj.add3(4,5,6))
print(obj.Mul2(2,4))
print(obj.sub2(5,2))   

    