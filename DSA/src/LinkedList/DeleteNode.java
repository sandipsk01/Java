package LinkedList;

public class DeleteNode extends TakeInputN {
	
	public static Node<Integer> deleteNode(Node<Integer> head, int pos) {
		// Write your code here.
		 if(head==null )
            return head;
		
        if(pos==0)
            return head.next;
        int count=0;
        Node<Integer> temp=head;
        while(temp!=null && count<pos-1)
        {
            temp=temp.next;
            count++;
        }
        if(temp==null)
            return head;
        if(temp.next!=null)
            temp.next=temp.next.next;
         
        
        return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
	      head=deleteNode(head, 2);
	      print(head);
	}

}
