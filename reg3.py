import re
data=re.findall('.','abcd ef12gh45@$')
data=re.findall('[0-9]','ab8cd123ef12gh45@$')
data=re.findall('[0-9]+','ab8cd123ef12gh45@$')
data=re.findall('[0-9]?','ab8cd123ef12gh45@$')
data=re.findall('[0-9]{2}','ab8cd123ef12gh45@$5656')
data=re.findall('\d{2}','ab8cd123ef12gh45@$')
data=re.findall('[0-9]{1,3}','ab8cd123ef12gh45@$')
print(data)