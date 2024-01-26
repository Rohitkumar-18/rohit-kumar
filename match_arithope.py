a=int(input('enter a first number'))
b=int(input('enter a second  numebr'))
ope=input('enter a operator ')
match ope:
    case '+':
        print(a+b) 
    case '-':
        print(a-b)
    case '*':
        print(a*b)
    case '/':
        print(a/b)
    case '//':
        print(a//b)
    case '%':
        print(a%b)                