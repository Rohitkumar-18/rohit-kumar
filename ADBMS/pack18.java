CREATE PACKAGE cust_Sala AS
PROCEDURE find_Sal(c_id customers.id%type);
END cust_sala;



SQL> CREATE PACKAGE cust_Sala AS
  2  PROCEDURE find_Sala(c_id customers.id%type);
  3  END cust_sala;
  4  /

Package created.

CREATE OR REPLACE PACKAGE BODY cust_Salar AS
PROCEDURE find_salar(c_id customers.id%TYPE)IS
c_salar customers.salary%TYPE;
BEGIN
SELECT salary INTO c_salar
FROM customers
WHERE id=c_id;
dbms_output.put_line('Salary:'||c_Salar);
END find_Salar;
END cust_salar;/

/

CREATE OR REPLACE TRIGGER display_Salary_changes
BEFORE DELETE OR UPDATE ON customers
FOR EACH ROW
WHEN(NEW .ID>0)
DECLARE
sal_diff number;
BEGIN
sal_diff:=NEW.salary -:OLD.salary;
dbms_output.put_line(;Old salary:'OLD.salary);
dbms_output.put_line(;New salary:'NEW.salary);

dbms_output.put_line('salary difference:'||sal_diff);
END;
/



