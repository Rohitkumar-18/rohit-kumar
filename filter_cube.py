b=[2,8,6,4,3,23,2,1,8,9]
print(list(map(lambda k:k**3,filter(lambda b:b%2==0,b))))
out=(i**3 for i in b if i%2==0)