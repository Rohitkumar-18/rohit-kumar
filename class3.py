class num:
    def __init__(self,a):
        self.a=a
    def square (self):
        return self.a**2    
    def cube(self):
        return self.a**3
    def double(self):
        return self.a*2
    def iseven(self):
        if self.a%2==0:
            return True
        else:
            return False
        def isprime(self):
            flag=True
        if self.b>1:
            for i in range(2,self.b):
                if self.b%i==0:
                   flag=False
                break
        return flag   
obj=num(5)           
