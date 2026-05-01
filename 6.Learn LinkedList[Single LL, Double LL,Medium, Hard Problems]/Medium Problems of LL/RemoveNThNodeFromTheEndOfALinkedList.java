import java.util.ArrayList;
import java.util.Arrays;

class Node {
    int data;
    Node next;

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class RemoveNThNodeFromTheEndOfALinkedList {
    public static Node removeNthFromEnd(Node head, int n) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node fast = dummy;
        Node slow = dummy;

        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
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
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        Node head = new Node(arr.get(0));
        head.next = new Node(arr.get(1));
        head.next.next = new Node(arr.get(2));
        head.next.next.next = new Node(arr.get(3));
        head.next.next.next.next = new Node(arr.get(4));

        System.out.print("Original List: ");
        printList(head);

        int n = 2;
        head = removeNthFromEnd(head, n);

        System.out.print("After removing " + n + "nd node from end: ");
        printList(head);
    }
}