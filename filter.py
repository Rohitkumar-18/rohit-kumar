a=[1,0,True,'str',[1,2,3],78,0.0]
out=[ i for i in a if bool(i)!=False]
print(out)   