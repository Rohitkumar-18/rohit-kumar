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
    insertrecord(4,'ishankishan')
    insertrecord()
def read_records():
    query='select * from mcarohit'
    cur.execute(query)
    records=cur.fetchall()
    for rows in records:
        print(rows) 
read_records()
def fetch_records(sid):
    record={'id':str(sid)}
    query='select * from mcarohit where id=:id'
    cur.execute(query,record)
    record=cur.fetchall()
    for row in record:
        print(row)
fetch_records(2)        
def update_name(sid,name):
    record={'id':str(sid),'name':name}
    query='select * from mcarohit where id =:id'           