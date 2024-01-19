database={username:'rtr','password':'123'}
a=input('username')
b=input('password')
if a==database['username'] and b==database['password']:
    print('successfully logined')
else:
    print('login failed')