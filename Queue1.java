import java.util.Scanner;

import ds.Stack.Snode;

public class Queue1 
{

	static Scanner sc=new Scanner(System.in);
	static class Snode
	{
		 int data;
		 Snode next;
		 Snode(int data)
		 {
			 this.data=data;
			 this.next=null;
		 }
	}
	Snode r=null;
	Snode f=null;
   void enqueue()
   {   System.out.println("enter the data");
	   int data=sc.nextInt();
	   Snode node=new Snode(data);
	   if(r==null)
	   {
		  r=node; 
		  f=node;
	   }
	   else
	   {  
		   r.next=node;
		   r=node;
		   
	   }
   }
   void dequeue()
   {  
	   if(f==null)
	   {
		   System.out.println("queue underflow");
	   }
	   else
	   {
		   Snode temp =f;
		   f=temp.next;
		   
	   }
   }
   void traversal()
   {
	   Snode temp=f;
	   while(temp!=null)
	   {
		   System.out.print(temp.data+ "->");
		   temp=temp.next;
	   }
   }
	public static void main(String[] args)
	{
		Queue1 s=new Queue1();
		 int m;
		do
		 {   System.out.println("enter value ,press 1 to enqueue,press 2 to dequeue,press 3 to traversal");
		    int n=sc.nextInt();
			 switch(n)
			 { 
			 case 1:
				 s.enqueue();
				 break;
			 case 2:
				 s.dequeue();
				 break;
			 case 3:
				 s.traversal();
				 break;
			 default :
				 System.out.println("exist sucessfully");
				 break;
			 
			 }
			 System.out.println("enter  press 1 to continue ");
			     m=sc.nextInt();
		 }while(m==1);
		System.out.println("exist sucessfully");
		

	}

}
