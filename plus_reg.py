ows = int(input('enter a number of rows :-'))
out=''
for i in range(rows):
    for j in range(rows):
        if i==j or i == rows-j-1:
            out+=' '
        else:   
            out+='*'
        out+='\n'
print(out)        
#name=input('enter file name')
#with open(f'{name}.txt','w') as file:
#file.write(out)       