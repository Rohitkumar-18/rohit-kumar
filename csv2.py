import csv
# file= open('sample.csv','w')
with open('sample.csv','w') as file:
    data=[
        [1,'virat',35],
        [2,'maxwell',34],
        [3,'green',26],
        [4,'siraj',28],
        ]
    record=csv.writer(file)
    record.writerow(['id','Name','age'])
    record.writerows(data)