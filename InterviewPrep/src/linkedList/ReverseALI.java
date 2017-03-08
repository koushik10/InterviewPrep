package linkedList;

public class ReverseALI {

static LinkedListNode head;
	
	static class LinkedListNode {
		
		int data;
		LinkedListNode next;
		
		public LinkedListNode(int d){
			
			data=d;
			next=null;
		}
	
	}
	LinkedListNode reverseALI(LinkedListNode node){
		
		LinkedListNode prev=null;
		LinkedListNode current=node;
		LinkedListNode next=null;
		
		while(current!=null){
			next=current.next;
			current.next = prev;
			prev=current;
			current=next;
		}
		
		node = prev;
		return node;	
	}
	
	void printList(LinkedListNode node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
	}
	
   public static void main(String args[]){
		
	    ReverseALI list = new ReverseALI();
        list.head = new LinkedListNode(1);
        list.head.next = new LinkedListNode(2);
        list.head.next.next = new LinkedListNode(3);
        list.head.next.next.next = new LinkedListNode(4);
         
        System.out.println("Given Linked list");
        list.printList(head);
        head = list.reverseALI(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
    }


}
