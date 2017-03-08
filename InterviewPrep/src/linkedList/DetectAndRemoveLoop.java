package linkedList;

public class DetectAndRemoveLoop {

	static Node head;
	
	static class Node {
		
		int data;
		Node next;
		
		public Node(int d){
			
			data=d;
			next=null;
		}
		
	}
		
		public int detectAndRemoveLoop(Node node){
			Node slow=node, fast=node;
			while(slow!=null && fast!=null && fast.next!=null){
				slow = slow.next;
				fast= fast.next.next;
				
				if(slow==fast){
					removeLoop(slow, node);
					System.out.println("Loop Detected");
					return 1;
					}
				}
			return 0;
			}
		
		void removeLoop(Node slow, Node node){
			Node p1=null, p2=null;
			
			p1=node;
			while(true){
				
				p2=slow;
				while(p2.next!=slow && p2.next!=p1){
					p2=p2.next;
				}
				
				if(p2.next==p1){
					break;
				}
				p1=p1.next;
			}
			p2.next=null;
		}
		
		 void printList(Node node) {
		        while (node != null) {
		            System.out.print(node.data + " ");
		            node = node.next;
		        }
		    }
		 public static void main(String[] args) {
			 DetectAndRemoveLoop list = new DetectAndRemoveLoop();
		        list.head = new Node(10);
		        list.head.next = new Node(20);
		        list.head.next.next = new Node(50);
		        list.head.next.next.next = new Node(60);
		  
		        // Creating a loop for testing 
		        head.next.next.next.next = head.next.next;
		        list.detectAndRemoveLoop(head);
		        System.out.println("Linked List after removing loop : ");
		        list.printList(head);
		    }

}
