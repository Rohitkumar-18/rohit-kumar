a=input('enter a string')
out=[]
for i in range(100,1000):
    if str(i)==str(i)[::-1]:
          out+=[i]
print(out)          
