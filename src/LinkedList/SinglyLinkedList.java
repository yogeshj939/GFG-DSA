package LinkedList;

import java.util.HashSet;

public class SinglyLinkedList {

    private static Node head;

    public static void createLinkedList(int[] arr){
        head = new Node(arr[0]);
        head.setNext(new Node(arr[1]));
        head.getNext().setNext(new Node(arr[2]));
        recursiveTraversal(head);
    }

    public static void traverseLinkedList(Node head){
        Node curr = head;
        while(curr != null){
            System.out.println(curr.getVal());
            curr = curr.getNext();
        }
    }

    public static void recursiveTraversal(Node head){
        if(head == null){
            return;
        }
        System.out.print(head.getVal()+" ");
        recursiveTraversal(head.getNext());
    }

    public static Node insertAtBegin(Node head, int val){
        Node temp = new Node(val);
        temp.setNext(head);
        return temp;
    }

    public static Node insertAtEnd(Node head, int val){
        if(head == null)
            return new Node(val);
        Node curr = head;
        while(curr.getNext() != null){
            curr = curr.getNext();
        }
        curr.setNext(new Node(val));
        return head;
    }

    public static Node deleteAtFirst(Node head){
        return head.getNext();
    }

    public static Node deleteAtLast(Node head){
        if(head == null) return null;
        if(head.getNext() == null) return null;
        Node curr = head;
        while(curr.getNext().getNext() != null){
            curr = curr.getNext();
        }
        curr.setNext(null);
        return head;
    }

    public static Node insertAtPos(Node head, int pos, int val){
        if(pos == 1) {
            Node temp =  new Node(val);
            temp.setNext(head);
        }
        Node curr = head;
        Node temp = new Node(val);
        int i = 0;
        while(i < pos-2 && curr != null){
            curr = curr.getNext();
            i++;
        }
        if(curr == null){
            System.out.println("Invalid Position");
            return head;
        }
        temp.setNext(curr.getNext());
        curr.setNext(temp);
        return head;
    }

    public static int searchRecursive(Node head, int val){
        if(head == null) return -1;
        if(head.getVal() == val) return 1;
        else {
            int res = searchRecursive(head.getNext(),val);
            if(res == -1) return -1;
            else return (res+1);
        }
    }

    //The question is to find the middle node of the linked list and print its value.
    public static void printMiddleNode(Node head){

        /*
        Implemented using slow and fast pointer approach.
        When fast moves 2 nodes, slow moves 1 node.
        hence when fast is at the end, slow will be at the middle.
         */

        if(head == null) return;

        if(head.next == null){
            System.out.println(head.val);
            return;
        }

        Node slow = head, fast = head;
        while (fast != null || fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println(slow.val);
    }


    /*
    Two pointer approach. pointers : first and second
    1. Move first pointer n positions ahead.
    2. Start second pointer from head move both pointers until first is null
    3. second will be pointing to node n positions from right. print second pointer value.
     */
    public static void printNthNodeFromEnd(Node head, int n){
        if(head == null) return;
        Node first = head;
        for(int i = 0; i < n; i++){
            if(first == null) return;
            first = first.next;
        }

        Node second = head;
        while(first!= null){
            second = second.next;
            first = first.next;
        }

        System.out.println(second.val);
    }

    public static Node reverseIterative(Node head){
        if(head == null) return null;

        Node prev = null;
        Node curr = head;
        while(curr!= null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;

    }

    public static Node reverseRecursive1(Node head){
        if(head == null || head.next == null)
            return head;

        Node restHead = reverseRecursive1(head.next);
        Node restTail = head.next;
        restTail.next = head;
        head.next = null;
        return restHead;
    }


    public static Node reverseRecursive2(Node curr, Node prev){
        if(curr == null)
            return prev;

        Node next = curr.next;
        curr.next = prev;
        return reverseRecursive2(next,curr);
    }

    public static Boolean isLoop(Node head){
        HashSet<Node> set = new HashSet<>();
        for(Node curr = head; curr.next != null; curr = curr.next){
            if(set.contains(curr))
                return true;
            set.add(curr);
        }
        return false;
    }

    public static Node segregateEvenOdd(Node head){
        Node oddHead = null;
        Node oddTail = null;
        Node evenHead = null;
        Node evenTail = null;

        while(head.next != null){
            if(head.val%2 == 0){
                if(evenHead == null) {
                    evenHead = head;
                    evenTail = evenHead;
                }
                else
                    evenTail.next = head;
            } else {
                if(oddHead == null){
                    oddHead = head;
                    oddTail = oddHead;
                }
                else {
                    oddTail.next = head;
                }
            }
        }
        evenTail.next = oddHead;
        return evenHead;
    }

    /*
    Node implementation
     */
    public static class Node {

        private int val;
        private Node next;

        public Node(int val){
            this.val = val;
        }

        public void setNext(Node next){
            this.next = next;
        }

        public int getVal(){
            return this.val;
        }

        public Node getNext(){
            return this.next;
        }
    }
}

