class parent:
    a=10
    b=20
    def __init__(self,c,d):
        self.c=c
        self.d=d
    def display(self):
        print(self.c,self.d)    
class child(parent):
    a=30
    def __init__(self,c,d,e,f):
        super().__init__(c,d)
        self.e=e
        self.f=f
    def display(self):
        #parent.display(self)
        super().display()
        print(self.e,self.f)            
obj=child(4,5,6,7)    