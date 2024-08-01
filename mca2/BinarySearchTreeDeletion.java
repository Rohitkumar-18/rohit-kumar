import java.util.Scanner;
 class Node
{
int data;
Node leftChild;
Node rightChild;
Node parent;
public Node()
{
leftChild=rightChild=null;
data=0;
}
public Node(int data)
{
this.data=data;
this.leftChild=null;
this.rightChild=null;
}
public int getData()
{
return data;
}
}
public class BinarySearchTreeDeletion
{
Node root;
public void add(int data)
{
Node nodeToAdd=new Node(data);
if(root==null)
root=nodeToAdd;
else
traverseAndAddNode(root,nodeToAdd);
}
public void traverseAndAddNode(Node node,Node nodeToAdd)
{
if(nodeToAdd.getData()<node.getData())
{
if(node.leftChild==null)
{
nodeToAdd.parent=node;
node.leftChild=nodeToAdd;
}
else
{
traverseAndAddNode(node.leftChild,nodeToAdd);
}
}
else if(nodeToAdd.data>node.data)
{
if(node.rightChild==null)
{
nodeToAdd.parent=node;
node.rightChild=nodeToAdd;
}
else
{
traverseAndAddNode(node.rightChild,nodeToAdd);
}
}
}
public static void preOrderTraversal(Node root)
{
if(root==null)
return;
System.out.println(root.getData()+" ");
preOrderTraversal(root.leftChild);
preOrderTraversal(root.rightChild);
}
public static void inOrderTraversal(Node root)
{
if(root==null)
return;
inOrderTraversal(root.leftChild);
System.out.println(root.getData()+" ");
inOrderTraversal(root.rightChild);

}
public static void postOrderTraversal(Node root)
{
if(root==null)
return;
postOrderTraversal(root.leftChild);
postOrderTraversal(root.rightChild);
System.out.println(root.getData()+" ");
}
public boolean delete(int val)
{
//case 1: node has no childrens
//case 2:node has one child;
//case 3: node has two childrens

Node nodeTobeDeleted=find(val);
if(nodeTobeDeleted!=null)
{
if(nodeTobeDeleted.leftChild==null && nodeTobeDeleted.rightChild==null)
{
deleteCase1(nodeTobeDeleted);
}
else if(nodeTobeDeleted.leftChild!=null && nodeTobeDeleted.rightChild!=null)
{
deleteCase3(nodeTobeDeleted);
}
else if(nodeTobeDeleted.leftChild!=null)
{
deleteCase2(nodeTobeDeleted);
}
else if(nodeTobeDeleted.rightChild!=null)
{
deleteCase2(nodeTobeDeleted);
}
}
return false;
}
public Node find(int val)
{
if(root!=null)
{
return findNode(root,new Node(val));
}
return null;
}
private Node findNode(Node search,Node node)
{
if(search==null)
return null;
if(search.data==node.data)
{
return search;
}
else
{
Node returnNode=findNode(search.leftChild,node);
if(returnNode==null)
{
returnNode=findNode(search.rightChild,node);
}
return returnNode;
}
}
private  void deleteCase1(Node nodeTobeDeleted)
{
if(nodeTobeDeleted.parent.leftChild==nodeTobeDeleted)
{
nodeTobeDeleted.parent.leftChild=null;
}
else if(nodeTobeDeleted.parent.rightChild==nodeTobeDeleted)
{
nodeTobeDeleted.parent.rightChild=null;
}
}
private void deleteCase2(Node nodeTobeDeleted)
{
if(nodeTobeDeleted.parent.leftChild==nodeTobeDeleted)
{
if(nodeTobeDeleted.leftChild!=null)
{
nodeTobeDeleted.parent.leftChild=nodeTobeDeleted.leftChild;
}
else if(nodeTobeDeleted.rightChild!=null)
{
nodeTobeDeleted.parent.rightChild=nodeTobeDeleted.rightChild;
}
}
else if(nodeTobeDeleted.parent.rightChild==nodeTobeDeleted)
{
if(nodeTobeDeleted.leftChild!=null)
{
nodeTobeDeleted.parent.rightChild=nodeTobeDeleted.leftChild;
}
else if(nodeTobeDeleted.rightChild!=null)
{
nodeTobeDeleted.parent.rightChild=nodeTobeDeleted.rightChild;
}
}
}
private Node minLeftTraversal(Node node)
{
if(node.leftChild==null)
{
return node;
}
return minLeftTraversal(node.leftChild);
}
private void deleteCase3(Node nodeTobeDeleted)
{
Node minNode=minLeftTraversal(nodeTobeDeleted.rightChild);
deleteCase1(minNode);
minNode.parent=nodeTobeDeleted.parent;
minNode.leftChild=nodeTobeDeleted.leftChild;
minNode.rightChild=nodeTobeDeleted.rightChild;
if(nodeTobeDeleted.parent==null)
{
root=minNode;
}
else
{
if(nodeTobeDeleted.parent.leftChild==nodeTobeDeleted)
{
minNode.parent.leftChild=minNode;
}
else if(nodeTobeDeleted.parent.rightChild==nodeTobeDeleted)
{
minNode.parent.rightChild=minNode;
}
}
}
public static void main(String...args)
{
Scanner s=new Scanner(System.in);
BinarySearchTreeDeletion bst=new BinarySearchTreeDeletion();
bst.add(50);
bst.add(25);
bst.add(75);
bst.add(10);
bst.add(30);
bst.add(60);
bst.add(55);
bst.add(53);
bst.add(85);
bst.add(80);
bst.add(76);
bst.add(1);
bst.add(100);
while(true)
{
System.out.println("\n \t 1. In - Order Traversal \n \t 2. Pre - Order Traversal \n \t 3. Post - Order Traversal");
int choice;
System.out.println("Enter your choice::");
choice=s.nextInt();
switch(choice)
{
case 1:
	System.out.println("In-Order Traversal");
	inOrderTraversal(bst.root);
	System.out.println();
	break;
case 2:
	System.out.println("Pre-Order Traversal");
	preOrderTraversal(bst.root);
	break;

case 3:
	System.out.println("post-Order Traversal");
	postOrderTraversal(bst.root);
	break;
}
System.out.println("Do you want to delete a node enter a node value else press 0");
int no_to_del=s.nextInt();
bst.delete(no_to_del);
if(no_to_del==0)
System.out.println("Node"+no_to_del+"is not there");
else
System.out.println("Node"+no_to_del+"is deleted please select any traversal technique to see the result");
System.out.println("do you want to continue... \n Press Y||y for 'Yes' OR N || n for 'No'");
char ch=s.next().charAt(0);
if(ch=='N' || ch=='n')
{
System.out.println("Thank you and see you again.....");
break;
}
}
}
}