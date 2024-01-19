import random
i=0
otp=''
while len(otp)<6:
    otp+=str(random.randint(0,9))
print(otp)    