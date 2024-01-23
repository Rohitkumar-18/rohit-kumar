class Mtca:
    chariman='Mr.Sunil'
    location='Palamaner'
    college='MTCA'
    def __init__(self,name,mobile):
        self.name=name
        self.mobile=mobile
class Mca(Mtca):
    principal='Mr. Prabhakar naidu'
    strength=240
    staff=9
class Btech(Mtca):
    principal='Mr Rajasekar'
    strength=4000
    staff=100
class Degree(Mtca):
    principal='Mr .Madhusudhan'
    strength=1500
    staff=50 
Rohit=Degree('Rohitkumar',7670834000)
virat=Btech('virat',5654343434)