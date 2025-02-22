import java.util.Scanner;
class DLink
{
	public int data;
	public DLink prev;
	public DLink next;

	public  DLink(DLink prev,int data,DLink next)
	{
		this.prev=prev;
		this.data=data;
		this.next=next;
	}
}
class DoubleLinkedList
{
	private DLink head;
	private int size;
	public DoubleLinkedList()
	{
		head=null;
		size=0;
	}
	public boolean isEmpty()
	{
		return head==null;
	}
	public void addFront(int data)
	{
		if(head==null)
			head=new DLink(null,data,null);
		else
		{
			DLink new_node=new DLink(null,data,null);
			head.prev=new_node;
			new_node.next=head;
			head=new_node;
		}
		size++;
	}
	public void addLast(int data)
	{
		if(head==null)
			head=new DLink(null,data,null);
		else
		{
			DLink ptr=head;
			while(ptr.next!=null)
				ptr=ptr.next;
			DLink new_node=new DLink(null,data,null);
			ptr.next=new_node;
			new_node.prev=ptr;
		}
		size++;
	}
	public void addAny(int data,int pos)
	{
		if(head==null)
			head=new DLink(null,data,null);
		DLink ptr=head;
		for(int i=1;i<pos;i++)
			ptr=ptr.next;
		DLink new_node=new DLink(ptr,data,null);
		new_node.next=ptr.next;
		ptr.next.prev=new_node;
		ptr.next=new_node;
	}
	public void deleteFront()
	{
		if(head==null)
			return;
		else
		{
			head=head.next;
			head.prev=null;
			size--;
		}
	}
	public void deleteLast()
	{
		if(head==null)
			return;
		if(head.next==null)
		{
			head=null;
			size--;
		}
		DLink ptr=head;
		while(ptr.next.next!=null)
		
			ptr=ptr.next;
			ptr.next=null;
			size--;
		
	}
	public void deleteAny(int pos)
	{
		if(head==null)
			return;
		if(head.next==null)
		{
			head=null;
			size--;
		}
		DLink ptr=head;
		if(size==2)
		{
			ptr.next=null;
			size--;
		}
		else
		{
			for(int i=1;i<pos;i++)
				ptr.next=ptr.next.next;
				ptr.next.prev=ptr;
				size--;
			
		}
	}
	public void print()
	{
		if(head==null)
			System.out.println("List is Empty");
		else
		{
			DLink ptr=head;
			while(ptr!=null)
			{
				System.out.print(ptr.data+"------>");
				ptr=ptr.next;
			}
			System.out.println();
		}
	}
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		DoubleLinkedList d=new DoubleLinkedList();
		int info,pos;
		while(true)
		{
		System.out.println("Menu");
		System.out.println("\t1.Add Node at Front\n\t2.Add Node At Rear\n\t3.Remove Node at front\n\t4.Remove Node at Last\n\t5.Add Node At any position\n\t6.Remove at any position\n\t7.Display elements in list");
		System.out.println("Enter your choice");
		int choice=s.nextInt();
		switch(choice)
			{
			case 1:
				System.out.println("Enter data part for node");
				info =s.nextInt();
				d.addFront(info);
				break;
			case 2:
				System.out.println("Enter data part to a node");
				info=s.nextInt();
				d.addLast(info);
				break;
			case 3:
				d.deleteFront();
				System.out.println("Front node is deleted");
				break;
			case 4:
				d.deleteLast();
				System.out.println("Last node is deleted");
				break;
			case 5:
				System.out.println("Enter the data PART TO THE NODE");
				info=s.nextInt();
				System.out.println("Enter the position where you insert a node in list");
				pos=s.nextInt();
				d.addAny(info,pos);
				break;
			case 6:
				System.out.println("Enter the position where you deleted a node in list");
				pos=s.nextInt();
				d.deleteAny(pos);
				break;
			case 7:
				d.print();
				break;
			case 8:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Valid");
				break;
			}
		}
	}
}