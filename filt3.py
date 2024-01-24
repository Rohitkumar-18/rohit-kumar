def fun(arg):
    if type(arg) in [str,tuple,list,set,dict]:
        return len(arg)
    else:
        return arg
a=[1,2,[4,5,6],'xyz',(4,1,2,3)] 
print(list(map(fun,a)))   
