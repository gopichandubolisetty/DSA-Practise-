class Node{
    int data;
    Node next;

    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}




public class SearchAnElementInALinkedList {
    public static int searchIndex(Node head,int s){
        int ind=0;
        Node curr = head;
        while(curr!=null){
            if(curr.data==s){
                return ind;
            }
            ind++;
            curr=curr.next;
        }
        return ind;
    }

    public static void main(String[] args){
        Node head = new Node(10);
        head.next=new Node(20);
        head.next.next = new Node(30);
        System.out.println(searchIndex(head,20));
    }
}
