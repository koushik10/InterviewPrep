package linkedList;

public class ReverseALIRecursion {

    static LinkedListNode head;
    
    static class LinkedListNode {
 
        int data;
        LinkedListNode next;
 
        LinkedListNode(int d) {
            data = d;
            next = null;
        }
    }
 

    LinkedListNode reverseRecursively(LinkedListNode curr, LinkedListNode prev) {
 
        /* If last node mark it as head*/
        if (curr.next == null) {
            head = curr;
 
            /* Update next to previous node */
            curr.next = prev;
            return null;
        }
 
        /* Save curr->next node for recursive call */
        LinkedListNode next1 = curr.next;
 
        /* and update next ..*/
        curr.next = prev;
 
        reverseRecursively(next1, curr);
        return head;
    }
 
    // prints content of double linked list
    void printList(LinkedListNode node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
 
    public static void main(String[] args) {
        
    	ReverseALIRecursion list = new ReverseALIRecursion();
        list.head = new LinkedListNode(1);
        list.head.next = new LinkedListNode(2);
        list.head.next.next = new LinkedListNode(3);
        list.head.next.next.next = new LinkedListNode(4);
        list.head.next.next.next.next = new LinkedListNode(5);
        list.head.next.next.next.next.next = new LinkedListNode(6);
        list.head.next.next.next.next.next.next = new LinkedListNode(7);
        list.head.next.next.next.next.next.next.next = new LinkedListNode(8);
 
        System.out.println("Original Linked list ");
        list.printList(head);
        System.out.println("Original Linked list ");
        list.printList(head);
        LinkedListNode res = list.reverseRecursively(head, null);
        System.out.println("");
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(res);
        
    }
}
