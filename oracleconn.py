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
    record=(sid,name)
    query='''insert into mcarohit(id,mame) values(%s,%s)'''
    cur.execute(query,record)
    conn.commit()
    insertrecord()     