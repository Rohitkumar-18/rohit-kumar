out=[]
for k in range(100,500):
    b=k
    d=0
    while b>0:
          d=d*10+(b%10)
          b=b//10
    if d==k:
         out+=[k]
print(out)               