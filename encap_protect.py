class cname:
    _a=10
    b=20
    def __init__(self,c,d):
        self.c=c
        self.d=d
    def display(self):
        print(self.c,self.d)
class sub(cname):
    pass        
obj=cname(18,45)        