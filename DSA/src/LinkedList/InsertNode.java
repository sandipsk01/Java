package LinkedList;

public class InsertNode extends TakeInputN{
	
	 public static Node<Integer> insert(Node<Integer> head, int elem, int pos){
		    Node<Integer> nodeToBeInserted= new Node<Integer>(elem);

		    if(pos==0){
		      nodeToBeInserted.next= head;
		      head =nodeToBeInserted;
		      return head;
		    }else{
		        int count=0;
		        Node<Integer> prev= head;
		        while(count<pos-1 && prev!=null){
		          count++;
		          prev=prev.next;
		        }
		        if(prev!=null){
		            nodeToBeInserted.next= prev.next;
		            prev.next= nodeToBeInserted;
		        }
		        return head;
		    }
		  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
	      head=insert(head, 80,0);
	      print(head);
	}

}
