import java.util.Scanner;
class Bubble
{
	public static void main(String [] args){
		int len,flag=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array");
		len=s.nextInt();
		int a[]=new int[len+1];
		System.out.println("Enter the values in the array");
		for(int i=0;i<len;i++)
			a[i]=s.nextInt();
		for (int i=0;i<len;i++)
		{
			for(int j=0;j<len;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0)
				break;
		}
			for(int i=1;i<=len;i++)
				System.out.print(a[i]+" ");
	}
}