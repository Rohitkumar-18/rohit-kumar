import re
data='''
'vnefdfd,rffdfg,effsdd1h73687ap 32 k 585798euieap16k 98765'
'''
pattern='[Aa][Pp] ?[0-3] ?[1-9] ?[A-Za-z] ?[0-9]{4}'
data=re.findall(pattern,data)
print(data)