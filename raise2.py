class kuttyError(Exception):
    pass
class MobileNumberError(Exception):
    pass
try:
    name=input('enter a name')
    if len(name)<=4:
        raise kuttyError(f'name should be more than 4 characters but {len(name)} were given')
    else:
       print('name is validated')
       mob=input('enter a mobile number:-')   
    if len(mob)!=10:
        raise MobileNumberError(f'mobile number should be consist of 10 digits but {len(mob)} were given')
    else:
       print('mobile number validated')
except(kuttyError, MobileNumberError) as e:
    print(e) 