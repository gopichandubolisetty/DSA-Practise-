class Node{
    int data;
    Node next;

    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}


public class SegergateOddAndEvenNodesInLL {
    public Node segregateEvenOdd(Node head) {

      
        if (head == null || head.next == null) return head;

       
        Node evenHead = null, evenTail = null;
        Node oddHead = null, oddTail = null;


        Node current = head;

    
        while (current != null) {

            if (current.data % 2 == 0) {

                // First even node
                if (evenHead == null) {
                    evenHead = current;
                    evenTail = current;
                } else {
                    evenTail.next = current;
                    evenTail = current;
                }

            } else {
              
                if (oddHead == null) {
                    oddHead = current;
                    oddTail = current;
                } else {
                    oddTail.next = current;
                    oddTail = current;
                }
            }

            // Move to next node
            current = current.next;
        }

        // If no even nodes found, return odd list
        if (evenHead == null) return oddHead;

        // If no odd nodes found, return even list
        if (oddHead == null) return evenHead;

        // Combine even and odd lists
        evenTail.next = oddHead;

        // Set end of list to null
        oddTail.next = null;

        return evenHead;
    }

    public static void main(String[] args){
        Node head = new Node(17);
        head.next = new Node(15);
        head.next.next = new Node(8);
        head.next.next.next = new Node(12);
        head.next.next.next.next = new Node(10);
        head.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next = new Node(4);

        // Call segregation function
        Node newHead = sol.segregateEvenOdd(head);

        // Print result
        while (newHead != null) {
            System.out.print(newHead.data + " ");
            newHead = newHead.next;
        }
    }
}

