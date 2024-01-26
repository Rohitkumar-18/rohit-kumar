import re
data=re.findall('[^0-9]','abcd ef12gh45@$')
data=re.findall('.','abcd ef12gh45@$')
print(data)