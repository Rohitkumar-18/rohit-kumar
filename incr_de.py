class increment():
    def __init__(self,i):
        self.a=1
    def __str__(self):
        return self.a
    def __repr__(self):
        return self.a
    def increment(self):
        self.a+=1 
        return self.a   
    def decrement(self):
        self.a-=1
        return self.a
