create table stu
(sno number,
name varchar2(10),
m number,
p number,
c number,
total number,
percent number
);


insert into stu(sno,name,m,p,c) values(&sno,'&name',&m,&p,&c);


create trigger t2 after insert or update of m,p,c on stu
begin
update stu set total=m+p+c;
update stu set percent=total/3;
end;
  create view v1 as select sno,m,p,c from stu;

SQL> select * from stu;

       SNO NAME                M          P          C      TOTAL    PERCENT
---------- ---------- ---------- ---------- ---------- ---------- ----------
         4 virat              76         65         80        195         65
         6 67                 76         65          4        145 48.3333333
         8 maxi               45         90         54        155 51.6666667
         9 patidar             2         45         56        103 34.3333333

SQL> update stu set c=80 where sno=4;

1 row updated.

SQL> select * from stu;

       SNO NAME                M          P          C      TOTAL    PERCENT
---------- ---------- ---------- ---------- ---------- ---------- ----------
         4 virat              76         65         80        221 73.6666667
         6 67                 76         65          4        145 48.3333333
         8 maxi               45         90         54        189         63
         9 patidar             2         45         56        103 34.3333333









SQL> create view v1 as select sno,name,m,p,c from stu;

View created.

SQL> select * from v1;

       SNO NAME                M          P          C
---------- ---------- ---------- ---------- ----------
         4 virat              76         65         80
         6 67                 76         65          4
         8 maxi               45         90         54
         9 patidar             2         45         56

SQL> drop view v1;

View dropped.



