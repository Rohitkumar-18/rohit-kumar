def filter(string):
    vowels='aeiouAEIOU'
    out=''
    for i in vowels:
         if i not in string:
            out+=i
    return out
print(filter('green'))      