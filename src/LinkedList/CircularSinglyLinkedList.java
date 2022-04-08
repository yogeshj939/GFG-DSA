package LinkedList;

public class CircularSinglyLinkedList {

    public static class Node {

        private int val;
        Node next;

        public Node(int val){
            this.val = val;
        }
    }

    public static void printNodes(Node head){
        if(head == null) return;

        Node curr = head;

        //do while
        do{
            System.out.print(curr.val+" ");
            curr = curr.next;
        }while (curr != head);

        System.out.println();
        //for loop
        System.out.println(head.val +" ");
        for(Node r = head.next; r != head; r = r.next){
            System.out.print(r.val+" ");
        }
    }

    public static Node insertAtBegin(Node head, int val){
        Node temp = new Node(val);
        if(head == null){
            temp.next = temp;
            return temp;
        }

        Node curr = head;
        while(curr.next != head){
            curr = curr.next;
        }

        curr.next = temp;
        temp.next = head;

        return temp;
    }

    public static Node insertAtEnd(Node head, int val){
        Node temp = new Node(val);
        if(head == null) {
            temp.next = temp;
            return temp;
        }

        Node curr = head;
        while (curr.next != head){
            curr = curr.next;
        }
        temp.next = head;
        curr.next = temp;

        return head;
    }


    public static Node insertAtEndEff(Node head, int val){
        Node temp = new Node(val);
        if(head == null){
            temp.next = temp;
            return temp;
        }
        temp.next = head.next;
        head.next = temp;
        int t = head.val;
        head.val = temp.val;
        temp.val = t;

        return temp;
    }

    public static Node deleteHeadEff(Node head){
        if(head == null || head.next == null) return null;

        head.val = head.next.val;
        head.next = head.next.next;

        return head;
    }

    public static Node deleteKthNode(Node head, int k){
        if(head == null) return null;
        if(k == 1) return deleteHeadEff(head);

        Node curr = head;
        for(int i = 0; i < k-2; i++){
            curr = curr.next;
        }

        curr.next = curr.next.next;
        return head;
    }
}
