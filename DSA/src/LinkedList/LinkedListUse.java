package LinkedList;

public class LinkedListUse {
	
	public static Node<Integer> createLinkedList(){
		Node <Integer> n1= new Node<>(10);
		Node <Integer> n2= new Node<>(20);
		Node <Integer> n3= new Node<>(30);
		Node <Integer> n4= new Node<>(40);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		return n1;
	}
	
	public static void print(Node <Integer> head) {
		//System.out.println(head.next.data);
		Node<Integer> temp=head;
		while(temp!=null) {
			System.out.print(temp.data+ " ");
			temp= temp.next;
		}
		System.out.println();
	}
	public static int length(Node<Integer> head){
		//Your code goes here
		Node<Integer> temp = head;
		if(head==null){
			return 0;
		}
		int count = 0;     // linkedlist is 10,20,30,40,-1   "-1" used to stop linked list it will not be considered so length=4
		while (temp!= null) {
			temp = temp.next;
			count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head= createLinkedList();   // head is first node
		print(head);
		System.out.print(length(head));
	}

}
