class Node{
    int data;
    Node next;

    Node(int data1){
        this.data = data1;
        this.next=null;
    }
}




public class FindTheLengthOfTheLinkedList {
    public static int Findll(Node head){
        int len =0;
        Node curr = head;
        while(curr!=null){
            len++;
            curr=curr.next;
        }
        return len;
    }

    public static void main(String[] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next=new Node(30);
        System.out.println(Findll(head));
    }
}
