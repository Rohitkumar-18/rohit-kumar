class num():
    def __init__(self,b):
      self.b=b
    def isprime(self):
        flag=True
        if self.b>1:
            for i in range(2,self.b):
                if self.b%i==0:
                   flag=False
                break
        return flag          
