class Node{
    int data;
    Node next;

    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}


public class ReverseALinkedList {

    public static Node reverseLL(Node head){
        Node curr = head;
        Node prev = null;
        while(curr!=null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public static void printLL(Node head){
         Node curr = head;
         while(curr!=null){
            System.out.print(curr.data);
            System.out.print("->");
            curr = curr.next;
         }
         System.out.println("null");
    }
    public static void main(String[] args){
        Node head = new Node(10);
        head.next=new Node(20);
        head.next.next = new Node(30);
        printLL(head);
        head = reverseLL(head);
        printLL(head);
    }
}
