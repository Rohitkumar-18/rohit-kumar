import csv
# file= open('sample.csv','a)
with open('sample.csv','w',newline='') as csvfile2:
        fieldnames=['id','name','age']
        record=csv.DictWriter(csvfile2,fieldnames)
        record.writeheader()
        data=[
               {'id':1,'name':'rajaser','age':21},
               {'id':2,'name':'ramya','age':20}, 
        ]
        record.writerows(data)
with open('sample.csv','r',newline='') as csvfile2:
        records=csv.DictReader(csvfile2)
        for i in records:
         print(i)       