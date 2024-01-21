def func(a,b=0,*args,**kwargs):
    print(a,b,args,kwargs)
func(1,2,3,4,c=60,d=45)