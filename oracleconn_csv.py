import cx_Oracle
conn=cx_Oracle.Connection('system/manager@mother')
cur=conn.cursor()
def createtable():
    query='''create table mcarohit(
    id number(2) primary key,
    name varchar(50)
    )
    '''
    cur.execute(query)
def insertrecord(sid,name):
    record={'id':str(sid),'name':name}
    cur.execute("insert into mcarohit(id,name) values(:id,:name)",record)
    conn.commit()
    insertrecord(2,'bumrah')
    insertrecord(3,'maxwell')
    insertrecord(4,'ishank')
    insertrecord()
def read_records():
    query ='select * from mcarohit'
    cur.execute(query)
    records=cur.fetchall()
    for row in records:
        print(row)
    #with open('records.csv','w',newline='') as csvfile:
        #data=csv.writer(csvfile)
        #data.writerow['id','name']
        #for row in records:
            #data.writerow(row)
    

def truncate():
    query='select * from mcarohit'
    cur.execute(query)
def insert_from_csv():
  with open('records.csv','r') as csvfile:
      data=csv.reader(csvfile)
      data=list(data)
      for row in range(1,len(data)):
          insertrecord(*data [row])
          