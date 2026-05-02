class Node{
    int data;
    Node next;

    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}



public class DeleteTheMiddleNodeInLL {
    
    public static void printLL(Node head){
         Node curr = head;
         while(curr!=null){
            System.out.print(curr.data);
            System.out.print("->");
            curr = curr.next;
         }
         System.out.println("null");
    }

    public static Node deleteMiddleLL(Node head){
        if(head==null || head.next==null){
            return head;
        }

        Node slow = head;
        Node fast = head;
        Node prev = null;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }

        prev.next=slow.next;
        slow.next=null;
        return head;
    }

    public static void main(String[] args){
        Node head = new Node(1);
        head.next = new Node(5);
        head.next.next = new Node(2);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(1);
        printLL(head);
        deleteMiddleLL(head);
        printLL(head);
    }
}
