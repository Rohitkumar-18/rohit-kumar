import java.util.*;
class Arrayop
{
	public static void main(String args[])
	{
		while(true)
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Array operations");
			System.out.println("1.Insertion");
			System.out.println("2.Deletion");
			System.out.println("3.Searching");
			System.out.println("4.Sorting");
			System.out.println("5.Traversing");
			System.out.println("6.Merging");
			System.out.println("7.Exiting from the program");
			System.out.println("Enter your choice");
			int ch=s.nextInt();
			switch(ch)
			{
				case 1:
					insert();
					break;
				case 2:
					delete();
					break;
				case 3:
					search();
					break;
				case 4:
					sort();
					break;
				case 5:
					traversing();
					break;
				case 6:
					merge();
					break;
				case 7:
					System.out.println("Exiting the Program");
					System.exit(0);
					break;
				default:
					System.out.println("Invalid Choice");
					break;
			}
		}
	}
	//method for insertion
				static void insert()
				{
					int len,pos,e,i;
				Scanner s=new Scanner(System.in);
				System.out.println("Enter number of elements in an array");
				len=s.nextInt();
				int arr[]=new int[len+1];
				System.out.println("Enter Elements of an Array");
				for(i=0;i<len;i++)
				{
					arr[i]=s.nextInt();

				}
				System.out.println("Enter position where to insert an element");
				pos=s.nextInt();
				System.out.println("Enter the Element to be inserted");
				e=s.nextInt();
				for(i=len-1;i>=(pos-1);i--)
				{
					arr[i+1]=arr[i];
				}
				arr[pos-1]=e;
				System.out.println("After Inserting array elements are...");
				for(i=0;i<=len;i++)
				{
					System.out.print(arr[i]+" ");
				}
				System.out.println();
				} 
			//method for deletion
				static void delete()
				{
					int len1,pos1,e1,i1;
					Scanner s1=new Scanner(System.in);
					System.out.println("Enter number of elements in an array");
					len1=s1.nextInt();
					int arr1[]=new int[len1+1];
					System.out.println("Enter the Elements of an array");
					for(i1=0;i1<len1;i1++)
					{
						arr1[i1]=s1.nextInt();
					}
					System.out.println("Enter the Element to be deleted");
					e1=s1.nextInt();
					for(i1=0;i1<=len1-1;i1++)
					{
						if(arr1[i1]==e1)
						{
							for(int j=i1;j<(len1-1);j++)
							{
								arr1[j]=arr1[j+1];
							}
							break;
						}
					}
					System.out.println("After Deleting Array elements are:");
					for(i1=0;i1<(len1-1);i1++)
					{
						System.out.print(arr1[i1]+" ");
					}
					System.out.println();
				}
			//method for searching
				static void search()
	{
					Scanner s=new Scanner(System.in);
					System.out.println("Enter the length");
					int len=s.nextInt();
					int arr[]=new int[len];
					System.out.println("Enter the elements in array");
					for(int i=0;i<len;i++)
					{
						arr[i]=s.nextInt();
					}
					System.out.println("Enter the element to search");
					int e=s.nextInt();
					int f=0,p=0;
					for(int i=0;i<len;i++)
		{
						if (arr[i]==e)
						{
							f=f+1;
							p=i;
						}
		}
			if(f!=0)
			{
				System.out.println("The element is found at "+p);
			}
			else
			{
				System.out.println("Element not found");
			}
		}
	//method for sorting
	static void sort()
	{
		Scanner s=new Scanner(System.in);
					System.out.println("Enter the length");
					int len=s.nextInt();
					int arr[]=new int[len+1];
					System.out.println("Enter the elements in array");
					for(int i=0;i<len;i++)
		{
						arr[i]=s.nextInt();
		}
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(arr[i]>=arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	System.out.println("After Sorting");
	for(int i=0;i<len;i++)
		{
		System.out.print(arr[i]);
		}
		System.out.println();
	}
	static void traversing()
	{
		Scanner s=new Scanner(System.in);
					System.out.println("Enter the length");
					int len=s.nextInt();
					int arr[]=new int[len+1];
					System.out.println("Enter the elements in array");
					for(int i=0;i<len;i++)
		{
						arr[i]=s.nextInt();
		}
		System.out.println("Traversing");
		for(int i=0;i<len;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
//method for merging
	static void merge()
	{
		Scanner s=new Scanner(System.in);
		int len1,len2;
		System.out.println("Enter the length for array 1");
		len1=s.nextInt();
		System.out.println("Enter the elements for array 1");
		int a1[]=new int[len1];
		for(int i=0;i<len1;i++)
		{
			a1[i]=s.nextInt();
		}
		System.out.println("Enter the length for array 2");
		len2=s.nextInt();
		System.out.println("Enter the elements for array 2");
		int a2[]=new int[len2];
		for(int i=0;i<len2;i++)
		{
			a2[i]=s.nextInt();
		}
		int a[]=new int[len1+len2];
		for(int i=0;i<len1;i++)
		{
			a[i]=a1[i];
		}
		for(int i=0;i<len2;i++)
		{
			a[len1+i]=a2[i];
		}
		System.out.println("After Merging");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}