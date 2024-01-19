a=input('enter a  string')
out=' '
for char in a:
    if char not in out:
        out+=char
print(out)        
