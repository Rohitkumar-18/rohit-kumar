class mtca:
    principal=' Mr prabakar'
    college='MTCA'
    location='palamaner'
    def __init__(self,name,mob,email,sem):
        self.name = name
        self.mobile = mob
        self.mail = email
        self.sem = sem
    def update_mob(self,new):
        self.mobile=new
        print('mobile number updated') 
        def change_principal(cls,new):
            cls.principal=new
        @staticmethod
        def add(a,b):
            return a+b       
mohan=mtca('mohan',7678984543,'m@gma:il.com','1st')

