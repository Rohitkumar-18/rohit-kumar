class Mtca:
    principal='Mr prabhakar naidu'
    college='MTCA'
    locatio='palamaner'
    def __init__(self,name,mob,email,sem):
        self.name=name
        self.mobile=mob
        self.email=email
        self.sem=sem
    def update_mob(self,new):
        self.mobile=new
        print('mobile number updated')   
    @classmethod
    def change_principal(cls,new):
        cls.principal=new
mohan=Mtca('mohan',7678984543,'m@gmail.com','1st')