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



public class DeleteHeadOfDoublyLinkedList {

    public static Node deleteHead(Node head){
        Node preHead = head;
        head=head.next;
        head.prev=null;
        preHead.next=null;
        return head;
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
        printLL(head);
        head = deleteHead(head);
        printLL(head);
    }
}
