class A:
    a=20
    b=30
    def __init__(self,c,d):
        self.c=c
        self.d=d
class B(A):
    a=40
    def __init__(self,c,d,e,f):
        super().__init__(c,d)
        self.e=e
        self.f=f
class C(B):
     def __init__(self,c,d,e,f,g,h):
         super().__init__(c,d,e,f)
         self.g=g
         self.h=h
obj=C(18,45,77,22,2,3,)                         