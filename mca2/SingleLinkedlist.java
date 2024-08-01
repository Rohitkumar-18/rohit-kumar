import java.util.Scanner;
class Link{
	private int data;
	public Link link;
	public Link(int data);
	{

		This.data=data;
		link=null;
		}
		public Link(int data,Link link)
			{
			This.data=data;
			This.link=link;
			}
			public string Data(){
				return data+" ";
				}
				}
				class SingleLinkedList 
					{
					{
				
						private Link head;
						private int size;
						public SingleLinkedList();
							{
							head=null;size=0;
							}
							public booleanisEmpty()
						{
								return head==null;
						}
						public void addfront(int data)
						{
							if(head==null)
								head=new Link(data,null);
							else
							{
								Link newLink=new Link(data,head);
								newLink.link=head;
								head=newLink;
							}
							size++;
						}
						public void addLast(int data)
						{
							if(head==null)
								head=newLink(data,null);
							else
							{
								//Link current.link!=null)
									//current=current.link;
								//Link newLink=newLink(data,null);
								//else
								{
									Link current=head;
									while(current.link!=null)
										current=current.link;
									Link newLink=newLink(data,null);
									current.link=newLink;
								}
								size++;
							}
						public void addAny(int data,int pos)
						}
		
							if(head==nul)
								head=newLink(data,null);
							Link current=head;
							for(int i=1;i<pos;i++)
								current=current.link;
							Link newLink=newLink(data,null);
							newLink.link=currentlink;
							size++;
					}
					  public void deleteAny(int pos)
					{
						if (head==nul)
							return;
						Link current=head;
						for(int i=1;i<pos;i++)
							current=current.link.links;
							size--;
					}
					public void deletefornt()
					{
						if(head==nul)
							system.out.println("List is Empty");
						else
						{
							Link del=head;
							head=del.link;
						}
						size--;
					}
					public void deleteLast(){
						if(head==null);
						{
							head=null;
							size--;
						}
						Link current=head;
						while(current.link=null);
						size--;
					}
					public void print(){
						System.out.println("List is Empty");
						Link current=head;
						while(current.link!=null)
						{
							System.out.println(current.node());
							current=current.link;}
							System.out.println(current.Date()+"null");
							System.out.println();}
							public void main (String[]args)
							{
								Scanner sc=new Scanner(System.in);
								SingleLinkedList s=new SingleLinkedList();
								int info,pos;
								while(true)
								{
									System.out.println("menu");
									System.out.println("\n\t 1.Add Node At Front \n\t 2.Add Node At Rear \n\t 3.Remove Node At Front \n\t 4.Remove At Last \n\t 5.Add Node At position \n\t 6.Rename Node At Any Position \n\t 7.Display elements in list \n\t");
									System.out.println("\n Enter your choice\n");
									int choice=sc.nextInt();
									switch(choice)
									{

					             case 1:				
						                System.out.println("Enter data part to a node");
										info=sc.nextInt();
										s.addFront(info);
										break;
					             case 2:					
										System.out.println("Enter data part to a node");
										info=sc.nextInt();
										s.addLast(info);
										break;
                                 case 3:
										s.deleteFront();
										System.out.println("\n front node is deleted");
										break;
                                 case 4:
										s.deleteLast();
										System.out.println("\n Last node is deleted");
										break;
                                 case 5:
										System.out.println("Enter the data part to the node");
										info=sc.nextInt();
										System.out.println("Enter the position where you insert a node in list");
										pos=sc.nextInt();
										s.addAny (info,pos);
										break;
                    case 6:
										System.out.println("Enter the position where you delete a node in List");
										pos=sc.nextInt();
										s.deleteAny(pos);
										break;
										System.out.println("you are selection is not there in menu \n");
									}
									System.out.println("\n\n Do you want to continue...\n press y or Y for(yes)|| n or N for(No)");
									char ch=sc.next().charAt(0);
									if(ch=='n'||ch=='N')
									{
										System.out.println("\n\n Thank you see you again.\n\n");
										break;
									}
								}
							}
				}
							








                    