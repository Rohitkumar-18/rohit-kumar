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
mohan=mtca('mohan',7678984543,'m@gmail.com','1st')

