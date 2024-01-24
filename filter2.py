b=[2,57,8,6,4,3,23,2,1,21,35,8,9]
def multiple3(num):
    if num%3==0:
        return True
    else:
        return False
print(list(filter(multiple3,b))) 
print(list(filter(lambda num:num%3==0,b)))   


