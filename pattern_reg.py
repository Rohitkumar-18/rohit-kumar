rows=int(input('enter a number of rows :-'))
out=''
for i in range(rows):
    for j in range(rows):
        if i==j or i == rows-j-1:
            out+=' '
        else:
            out+='*'
        out+='\n'  
