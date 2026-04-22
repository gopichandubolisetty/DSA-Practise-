class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeletionOfTheHeadOfLL {

    public static Node deleteHead(Node head) {
        if (head == null) {
            return null;
        }

        head = head.next;
        return head;
    }

    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        printList(head);
        head = deleteHead(head);
        printList(head);
    }
}