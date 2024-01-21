def Range(start,stop,step):
    out=[]
    while start<stop:
        out+=[start]
        start+=step
    print(out) 
Range(1,100,1)       