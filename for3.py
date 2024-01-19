a=[1,2,'1',2.4,[4,5,6],9,16,'abcd']
out=0
for  i in a:
    if type(i)==int:
       if i%2==0:
          out+=i
       else:
          out-=i
print(out)
