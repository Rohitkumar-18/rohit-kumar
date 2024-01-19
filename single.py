x= eval(input('enter a value of x:'))
if type(x) in (bool,float,int,complex):
     print(x**2)
else:
     
     print(3*len(x))
    