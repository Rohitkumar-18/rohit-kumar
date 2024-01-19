import random
number=random.randint(100,1000)
while True:
    a=int(input('enter a number'))
    if a==number:
        print('congrsts!you successfully gussed the number',a)
        break
    elif a<number:
        print('enter some greater numner')
    else:
        print('enter some lesser number')    