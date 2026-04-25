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



public class InsertNodeBeforeHeadInDoubleLinkedList {
    public static Node insertAtHead(Node head,Node s){
        if(head==null){
            return s;
        }
        s.next=head;
        s.prev=null;
        head.prev=s;
        return s;
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
        Node insert = new Node(1);
        head = insertAtHead(head,insert);
        printLL(head);
    }
}
