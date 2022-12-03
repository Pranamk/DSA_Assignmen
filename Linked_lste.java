import java.util.Scanner;

public class Linked_lste {
    
	class Node
	{
		int data;
		Node Next;
		Node(int data)
		{
			this.data=data;
			this.Next=null;
		}
	}
	Node head;
	public  void InsertAtBegning(int data)
	{
		Node node = new Node(data);
		if(head==null)
		{
			
			head=node;
		}
		else {
		node.Next=head;  head=node;}
	}
	
	public void print()
	{ 
	Node temp = head;
		while(temp!=null)
		{
            System.out.print(temp.data+"----->");			
		      
            temp=temp.Next;
		}	
	}
	public void inseAtAvarave(int data,int pos)
	{
		Node temp=head;
		Node node = new Node(data);
				for(int i=0;i<pos-1;i++)
				{
					temp=temp.Next;
				}
				node.Next=temp.Next;
				temp.Next=node;
	}
	
	public void insertAtEnd(int data)
	{
		Node temp = head;
		Node node = new Node(data);
	    while(temp.Next!=null)	
	    {
	    	temp=temp.Next;
	    }temp.Next=node;
	}
	
	public int deleteBeg()
	{
		Node temp = head;
		head=temp.Next;
		int num = temp.data;
		temp=null;
		return num;
	}
	
	public  int   deleteLast()
	{
		Node 
		trav=head;
		Node preve=head;
		int number=0;
		while(trav!=null)
		{
			preve=trav;
			trav=preve.Next;
		    number=preve.data;
		    preve=null;
		}
		
		return number;
	}
	
	public void deletePos(int pos)
	{
		Node temp= head;
		Node preve=head; int number=0;
		for(int i=0;i<pos-1;i++) 
		{	
			
			temp=temp.Next;
			
		}preve=temp;
	    temp=preve.Next;
		   
	    preve.Next=temp.Next;
		
		
	}
	
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		String val;
		Linked_lste L = new Linked_lste();
		
		do
		{    System.out.print("ENTER : 1) AT BIGNING 2) PRINT 3)END 4) POSITION  \n  DELEATE : 5) BEGNING   ");                     int num=S.nextInt(); switch(num)
		           { 
		           case 1:
		                System.out.println("ENTER DATA : ");
		        	   L.InsertAtBegning(S.nextInt());
		        	   break;
		           case 2:
		        	   System.out.println("LIST ");
		    	       L.print();
		    	       System.out.println("null");
		               break;
		           case 3:
		        	   System.out.println("ENTER DATA AT END : ");
		        	   L.insertAtEnd(S.nextInt());
	   	               break;
		
		           case 4:
		        	   System.out.println("DATA");
		        	   System.out.println(" POSITION ");
		        	   L.inseAtAvarave(S.nextInt(),S.nextInt());
		        	   break;
		           case 5:
		        	   System.out.println("DELEATED  : "+L.deleteBeg());
                       break;		        
		           case 6:
		        	   System.out.println("DELEATED   "+L.deleteLast());
		        	   break;
		           case 7:
		        	   System.out.println("ENTER POSITION : ");
		        	   int pos =    S.nextInt();
		        	   L.deletePos(pos);
		        	   break;
		           default:
		        		   
		        		   System.out.println("INVALID OPTION  ");
		    	}
		
		    
			System.out.println("");
			System.out.println("CONTINUE ");
			val=S.next();
		}while(val.equals("continue"));
		S.close();
	}
}
