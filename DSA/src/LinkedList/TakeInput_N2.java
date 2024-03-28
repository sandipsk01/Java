package LinkedList;
import java.util.Scanner;
public class TakeInput_N2 {

	public static Node<Integer> takeInput(){
        Scanner s= new Scanner(System.in);
        int data = s.nextInt();
        Node<Integer> head = null;
        
        while(data != -1){
          Node<Integer> currentNode= new Node<Integer>(data);
	          if(head==null){
	        	  //Make this node as head
	            head=currentNode;
	          }else{
	            Node<Integer> tail = head;
	            while(tail.next!=null){
	                tail= tail.next;
	            }
	            // tail is referred to last node
	            // connect current node to last node
	            tail.next= currentNode;
	          }
          data=s.nextInt();
        }
        return head;
	}
	
	public static void main(String[] args){

	      Node<Integer> head = takeInput();
	  }
}
