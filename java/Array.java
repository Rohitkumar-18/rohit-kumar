import java.util.Scanner;
class InsertDelete
{
	public static void main(String args[])
	{
		menu();
	}
	static void menu()
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("1.Insertion");
			System.out.println("2.Deletion");
			System.out.println("3.exit");
			System.out.println("select any one option");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					int len,pos,e,i;
				Scanner s=new Scanner(System.in);
				System.out.println("enter number of elements in an array");
				len=nextInt();
				int arr[]=new int[len+1];
				System.out.println("enter elements of an array");
				 for(i=0;i<len;i++)
				{
					 arr[i]=s.nextInt();
				}
				System.out.println("enter position where to insert an element");
				pos=s.nextInt();
				System.out.println("enter element to be inserted");
				e=s.nextInt();
				for(i=len-1;i>=(pos-1);i--)
					int arr[]=new int[len+1];

         
}