public class Main
{
    Node head=null;
     int count=0;
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
            count++;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.next=null;
        count++;
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
  
    int findstart(int pos)
    {
        Node curr=head;
        if(pos<count)
        {
        for(int i=1;i<pos;i++)
        {
            curr=curr.next;
        }
        }
        else{
            System.out.print("invalid");
            return 0;
        }
        return curr.data;
        
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
	    System.out.println("Elment from start " + m.findstart(3));
	 
	
	}
}
