a="user@123#admin"
out=' '
for char in a:
    if not '0'<=char<='9':
        out+=char
print(out)        
