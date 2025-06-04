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

    void skip(int k)
    {
        Node temp=head;
        Node prev=null;
        int c=1;
        
        while(temp!=null)
        {
            if(c%k==0)
            {
                prev.next=temp.next;
                
            }
            else{
                prev=temp;
            }
            temp=temp.next;
            c++;
        }
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
	    System.out.println("elment removing kth node");
	    m.skip(2);
	    m.dis();
	   
	
	}
}

//output
// 4 5 7 45 10 
// elment removing kth node
// 4 7 10 
