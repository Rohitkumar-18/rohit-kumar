import csv
# file= open('sample.csv','a)
with open('sample.csv','r',newline='') as file:
        record=csv.reader(file)
        for i in record:
                print(i)
