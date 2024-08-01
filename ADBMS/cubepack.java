DECLARE
a number;
PROCEDURE cubeNum(x IN OUT number)IS
BEGIN
x:=x*x*x;
END;
BEGIN
a:=3;
cubeNum(a);
dbms_output.put_line('cube of(3):'||a);
END;
/