import java.util.Scanner;
class DLink
{
public int data;
public DLink prev;
public DLink next;
public DLink(DLink prev,int data,DLink next)
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
 size++;
}
public void deleteFront()
{
 if(head==null)
 {
 return;
 }
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
 {
 System.out.println("List is empty");
 }
else
 {
 DLink ptr=head;
 while(ptr!=null)
 {
 System.out.print(ptr.data+"---->");
 ptr=ptr.next;
 }
 }
}
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
DoubleLinkedList dl=new DoubleLinkedList();
int info,pos;
while(true)
 {
System.out.println("--------MENU------");
System.out.println("\n\t 1.Add Node At Front\n\t 2.Add Node At Rear\n\t 3.Remove Node At Front\n\t 4.Remove At Last\n\t 5.Add node At Position\n\t 6.Remove Node At Any Pos\n\t 7.Display Elements in list");
 System.out.println("enter ur choice");
 int choice =s.nextInt();
 switch(choice)
 {
 case 1:
 System.out.println("enter data part to a node");
 info=s.nextInt();
dl.addFront(info);
break;
 case 2:
 System.out.println("Enter data part to a node");
info=s.nextInt();
dl.addLast(info);
break;
 case 3:
 dl.deleteFront();
System.out.println("\n Front node is deleted");
break;
 case 4:
 dl.deleteLast();
System.out.println("\n Last node is deleted");
break;
 case 5:
 System.out.println("Enter the data part to the node");info=s.nextInt();
System.out.println("Enter the position where you insert a node in list");
 pos=s.nextInt();
 dl.addAny(info,pos);
break;
 case 6:
 System.out.println("Enter the position where you deleted a node in list");
 pos=s.nextInt();
 dl.deleteAny(pos);
break;
 case 7:
 dl.print();
break;
 
 default:System.out.println("you are selection is not there in menu\n");
 }
 System.out.println("\n \n Do you want to continue...\n press y or Y for(Yes)||n or N for(No)");
 char ch=s.next().charAt(0);
 if(ch=='n'||ch=='N')
 {
 System.out.println("\n \n Thank you see you again..\n\n");
 break;
 }
}
}
}
 
 
 