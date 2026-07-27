class Node {
    int data;
    Node next;

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class ReverseLLinGroupOfGivenSizeK {

    private static int getLength(Node head) {
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    private static Node reverseSegment(Node start, Node end) {
        Node prev = null;
        Node curr = start;
        Node stop = end.next;

        while (curr != stop) {
            Node nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return end;
    }

    public static Node kReverse(Node head, int k) {
        if (head == null || head.next == null || k <= 1) {
            return head;
        }

        int length = getLength(head);
        int totalGroups = length / k;

        Node dummy = new Node(0);
        dummy.next = head;

        Node prevGroupTail = dummy;
        Node curr = head;

        for (int i = 0; i < totalGroups; i++) {
            Node start = curr;
            Node end = curr;

            for (int j = 1; j < k; j++) {
                end = end.next;
            }

            Node nextGroupHead = end.next;
            Node reversedGroupHead = reverseSegment(start, end);

            prevGroupTail.next = reversedGroupHead;
            start.next = nextGroupHead;

            prevGroupTail = start;
            curr = nextGroupHead;
        }

        return dummy.next;
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + (temp.next != null ? " -> " : ""));
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);

        int k = 3;

        System.out.print("Original List: ");
        printList(head);

        head = kReverse(head, k);

        System.out.print("Reversed in K-groups: ");
        printList(head);
    }
}