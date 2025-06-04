public class Main
{
    Node head=null;
    class Node{
        int data;
        Node next;
        Node(int val)
        {
            data=val;
            next=null;
        }
    }
    
    void insertatend(int val)
    {
        Node newnode=new Node(val);
        if(head==null)
        {
            head=newnode;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.next=null;
       
    }
    
    void dis()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data +" ");
            temp=temp.next;
           
        }
      
    }
    
    Node reving(Node head,int k)
    {
         Node next=null;
       Node current=head;
       int c=0;
       Node prev=null;
       while(current!=null && c< k)
       {
           next=current.next;
           current.next=prev;
           prev=current;
           current=next;
           c++;
       }
        if (next != null) {
        head.next = reving(next, k);
    }
       return prev;
    }
   void reverse()
   {
       Node next;
       Node current=head;
       
       Node prev=null;
       while(current!=null)
       {
           next=current.next;
           current.next=prev;
           prev=current;
           current=next;
       }
       head=prev;
   }
	public static void main(String[] args) {
	    Main m=new Main();
	    m.insertatend(4);
	    m.insertatend(5);
	    m.insertatend(7);
	    m.insertatend(45);
	     m.insertatend(10);
	    m.dis();

	    System.out.println();
	    System.out.println("\nReverse the elemnt");
	    m.reverse();
	    m.dis();
	     System.out.println("\nReverse by group the elemnt");
	    m.head=m.reving(m.head,2);
	    m.dis();
	
	}
}
//ouput:

// 4 5 7 45 10 

// Reverse the elemnt
// 10 45 7 5 4 
// Reverse by group the elemnt
// 45 10 5 7 4 
