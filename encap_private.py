class cname:
    __a=18
    b=45
    def __init__(self,c,d):
        self.c=c
        self.d=d
    def __display(self):
        print(self.__c,self.d)
    @classmethod    
    def classdisplay(cls):
        print(cls.__a,cls.b)
class sub(cname):
    pass        
obj=sub(10,200)        