import java.io.*;
import java.util.*;
class Bit
{
	public static void main(String arg[])throws IOException
{
BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
Scanner in=new Scanner(System.in);
int n,p;
System.out.println("1-Bit stuffing");
System.out.println("2-Character Stuffing");
System.out.println("enter ur choice");
System.out.println("1-Bit stuffint");

int ch=in.nextInt();
switch(ch)
{
case 1:
	System.out.println("enter n value");
	n=in.nextInt();
	int a[]=new int[n+4];
	System.out.println("Read the bit");
for(int i=0;i<n;i++)
a[i]=in.nextInt();
System.out.println("THE GIVEN INPUT:");
for(int i=0;i<n;i++)
System.out.print(a[i]+"");
p=0;
for(int i=0;i<n;i++)
{
if(a[i]==1)
p++;
else
p=0;
if(p==5)
{
p=0;
for(int j=n;j>=i;j--)
a[j+1]=0;
n++;
}
}
System.out.print("The output:");
for(int i=0;i<n;i++)
System.out.print(a[i]+"");
break;
case 2:
System.out.println("enter no of Characters ");
n=in.nextInt();
char[]b=new char[n+5];
System.out.println("enter input String");
for(int i=0;i<n;i++)
b[i]=(char)b1.read();
System.out.println("THE GIVEN INPUT STRING IS:");
for(int i=0;i<n;i++)
System.out.print(b[i]+"");
System.out.println();
p=0;
for(int i=0;i<n;i++)
{
if(b[i]!='*')
 p++;
else
p=0;
if(p==5)
if(b[i+1]!='*')
{
p=0;
for(int j=n;j>i;j--)
b[i+1]='*';
n++;
}
}
System.out.println("THE OUTPUT STRING IS:");
for(int i=0;i<n;i++)
System.out.print(b[i]+"");
break;
}
}
}//end bit
