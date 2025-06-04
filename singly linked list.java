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
    void insertbeg(int val)
    {
        Node newnode=new Node(val);
         if (head == null)
            head = newnode;
        else {
            newnode.next = head;
            head = newnode;
        }

    }
        public void insertAtPos(int pos, int val) {
        if (pos == 0) {
            insertbeg(val);
            return;
        }

        Node newnode = new Node(val);
        Node temp = head;
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
             }

        newnode.next = temp.next;
        temp.next = newnode;
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
    void deletebeg()
    {
        if(head==null)
        {
            return;
        }
        head=head.next;
    }
    public void deleteAtPos(int pos) {
        if (head == null)
          return;

        if (pos == 0) {
            head = head.next;
            return;
        }

        Node temp = head;
        Node prev = null;

        for (int i = 1; i <= pos; i++) {
            prev = temp;
            temp = temp.next;
            if (temp == null)
                System.out.print("Invalid Position: " + pos);
        }


        prev.next = temp.next;
    }

    
    void dis()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data +" ");
            temp=temp.next;
            count++;
           
        }
      
    }
    
    int length()
    {
         int v=count/2;
       Node curr=head;
       for(int i=1;i<=v;i++)
       {
           curr=curr.next;
       }
       return curr.data;
    }
   
	public static void main(String[] args) {
	    Main m=new Main();
	    m.insertatend(4);
	    m.insertatend(5);
	    m.insertatend(7);
	    m.insertbeg(7);
	     m.insertbeg(71);
	    m.insertbeg(11);
	    m.insertAtPos(2,8);
	    m.deletebeg();
	    m.deleteAtPos(2);
	    
	  
	    m.dis();
	    System.out.println();
	    System.out.println("Middle elemnet");
	    System.out.println(m.length());
	   
	
	}
}
