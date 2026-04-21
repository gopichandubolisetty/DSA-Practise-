class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class InsertionAtTheHeadOfLinkedList {

    public static Node insertAtHead(Node head, int newData) {
        Node newNode = new Node(newData, head);
        return newNode;
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(3);

        head = insertAtHead(head, 1);

        printList(head);
    }
}