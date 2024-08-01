import javba.io.*;
import java.util.Scanner;
class Stack1
{
	static int ch;
	int element,maxsize,top;
	int[]st;
	public Stack()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter stack size");
		maxsize=sc.nextInt();
		st=new int[maxsize];
		top=-1;
	}
	public void push(int element)
	{
		if(top>=maxsize)
		{
			System.out.println("Over flow");
		}
		//try
		//{
			//{
				//st[++top]=element;
			//}
			//catch(ArrayIndexOutofBoundException e)
			//{
				//System.out.println(e);
			//}
		//}
		  public int pop()
		{
			if(top==-1)
			{
				System.out.println("underflow");
				return(-1);
			}
			return(st[top-1]);
		}
		public void display(int[] st,int maxsize)
		{
			int i;
			System.out.println("Stack elements:");
			for(i=0;i<=max_size;i++)
				System.out.println(st[i]);
		}
	}
	class MyStack
	{
		//static int ch;
		public static void main(String args[]
		{
			Stack obj=new Stack();
			while(true)
			{
				System.out.println("/n enter your choice\n 1.push \n 2.pop \n 3.Display \n 4.Exit");
				Scanner sc=new Scanner(System.in);
				int ch=sc.nextInt();
				switch(ch)
				{
					case 1:
						System.out.println("Enter element");
					int x=sc.nextInt();
					obj.push(x);
					break;
					case 2:
						System.out.println("poped elements is%d",obj.pop());
					break;
					case 3:
						obj.display(obj.st,obj.top);
					break;
					case 4:
						s.exit(0);
					default:
						System.out.println("wrong option");
				}
			}
		}
	}
		
	