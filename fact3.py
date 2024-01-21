def fact():
    num=int(input('enter a number :-'))
    out=1
    for i in range(1,num+1):
        out*=i
    print(out) 
fact()   