rows=int(input('enter number of rows:'))
temp=rows//2
out=''
for i in range(rows):
    for j in range(rows):
        if i in [j,rows-j-1,temp] or j in[temp]:
            out+='*'
        else:
            out+=' '
    out+='\n'
print(out)
#name=input('enter file name')
#with open(f'{name}.txt','w') as file:
 #   file.write(out)                