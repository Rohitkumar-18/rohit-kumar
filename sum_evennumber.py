def sum(num):
    if len(str(num))==6:
        sum=0
        for i in str(num):
          if int(i)%2==0:
             sum+=int(i)
        return sum
    else:
        print('enter 6 digit number')
print(sum(246824))        
   