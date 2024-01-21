def vowel(a):
    i=0
    out=[]
    while i<len(a):
        if a[i] in 'aeiouAEIOU':
            out+=[i]
        i+=1
    return out
print(vowel('yellow'))         