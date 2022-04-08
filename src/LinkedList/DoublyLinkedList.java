package LinkedList;

public class DoublyLinkedList {

    //Node class with reference to prev and next
    public static class Node {

        private int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val = val;
        }
    }

    public static Node insertAtBegin(Node head, int val){
        Node temp = new Node(val);
        temp.next = head;
        if(head != null)
            head.prev = temp;

        return temp;
    }

    public static Node insertAtEnd(Node head, int val){
        Node temp = new Node(val);
        if(head == null) return temp;

        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }

        curr.next = temp;
        temp.prev = curr;

        return head;
    }

    public static Node reverseDoublyLinkedList(Node head){

        if (head == null || head.next == null) return head;

        Node curr = head;
        Node prev = null;
        while(curr != null){
            prev = curr.prev;
            curr.prev = curr.next;
            curr.next = prev;

            curr = curr.prev;
        }

        return prev.prev;
    }

    public static Node deleteHeadOfDoublyLinkedList(Node head){
        if(head == null || head.next == null) return null;

        head = head.next;
        head.prev = null;

        return head;
    }

    public static Node deleteLastOfDoublyLinkedList(Node head){
        if(head == null || head.next == null) return null;

        Node curr = head;
        while (curr.next!= null){
            curr = curr.next;
        }

        curr.prev.next = null;

        return head;
    }
}

