def rev_vowel(str):
    temp=''
    for i in str:
        if i in 'aeiouAEIOU':
          temp+=i
    j=-1
    out=''      
    for k in str:
        if k in 'aeiouAEIOU':
          out+=temp[j]
          j+=-1
        else:
          out+=k
    return out              
print(rev_vowel('hello'))         

