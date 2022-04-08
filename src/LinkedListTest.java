import LinkedList.SinglyLinkedList;

public class LinkedListTest {

    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3};
        SinglyLinkedList.Node head = new SinglyLinkedList.Node(arr[0]);
        head.setNext(new SinglyLinkedList.Node(arr[1]));
        head.getNext().setNext(new SinglyLinkedList.Node(arr[2]));

        SinglyLinkedList.recursiveTraversal(head);
        System.out.println();
        head = SinglyLinkedList.insertAtPos(head,4,10);
        System.out.println(SinglyLinkedList.searchRecursive(head,20));
        SinglyLinkedList.recursiveTraversal(head);
    }
}
