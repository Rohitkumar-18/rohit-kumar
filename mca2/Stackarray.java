import javba.io.*;
import java.util.Scanner;
class Stackarray
{
	static int ch;
	int top,size,data;
	int[]a;
	public Stackarray()
	{
		top=-1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter stack size");
		size=sc.nextInt();
		a=new int[size];
	}
	public void push(int data)
	{
		if(top>size)
		{
			System.out.println("Over flow");
		}
	else
		{
		a[++top]=data;
		}
	}
		public void display(int[] a,int size)
		{
			for(i=0;i<=size;i++)
			{
				System.out.println(a[i]);
			}
		}
		public void peek()
	{
			if(top>=size)
		{
           System.out.println("over flow");
		}
		else
		{
			System.out.println("the top of the element is"+""+a[top]);
		}
	}
	public int pop()
	{
		if(top<=-1)
		{
			System.out.println("under flow")
		}
		return (a[top--]);
	}
	public static void main(String []args)
		Stackarray =new stackarray();
	Scanner sc=new Scanner(System.in);
	while(true)
	{
		System.out.println("\n enter ur choice \n 1.push\n 2.pop \n3.peek \n 4.display\n 5.exit");
		System.out.println("enter ur choice");
		int ch=sc.nextInt();
		switch(ch)
		{

					case 1:
						System.out.println("Enter element");
					int x=sc.nextInt();
					s.push(x);
					break;
					case 2:
						System.out.println("poped elements is"+"",s.pop());
					break;
					case 3:
						s.peek;
					break;
					case 4:
						s.display(s.a,s.top);
					break;
					case 5:
						System.exit(0);
					default:
						System.out.println("wrong option");
				}
			}
		}
	}
		
	