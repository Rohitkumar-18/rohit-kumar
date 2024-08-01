
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
