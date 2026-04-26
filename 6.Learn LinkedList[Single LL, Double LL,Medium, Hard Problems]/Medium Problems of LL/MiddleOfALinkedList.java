class Node{
    int data;
    Node prev;
    Node next;

    Node(int data1){
        this.data=data1;
        this.prev=null;
        this.next=null;
    }

    Node(int data1,Node prev1,Node next1){
        this.data=data1;
        this.prev=prev1;
        this.next=next1;
    }
}


public class MiddleOfALinkedList {

    public static Node MDLL(Node head){
        Node curr = head;
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    public static void printLL(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" <->");
            curr=curr.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args){
        Node head = new Node(10);
        head.next= new Node(20,head,null);
        head.next.next= new Node(30,head.next,null);
        head.next.next.next = new Node(40,head.next.next,null);
        printLL(head);
        Node mid = MDLL(head);
        System.out.println(mid.data);
    }
}
