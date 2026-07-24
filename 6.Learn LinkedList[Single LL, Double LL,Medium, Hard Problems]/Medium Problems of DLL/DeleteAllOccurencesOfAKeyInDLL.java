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

public class DeleteAllOccurencesOfAKeyInDLL {

    public static void printLL(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" <->");
            curr=curr.next;
        }
        System.out.println("null");
    }

    public static Node insertAtEnd(Node head,int val){

        Node newNode = new Node(val);

        if(head==null){
            return newNode;
        }

        Node curr = head;

        while(curr.next!=null){
            curr  = curr .next;
        }
        curr.next = newNode;
        newNode.prev=curr;
        return head ; 
    }

    public static Node deleteAllOccurences(Node head,int tar){

        while(head!=null && head.data==tar){
            head = head.next;
        }

        

        if(head==null){
            return head;
        }

        head.prev = null;

        Node curr = head;
        while(curr!=null){
            if(curr.data==tar){
                curr.prev.next = curr.next;
                if(curr.next!=null){
                    curr.next.prev=curr.prev;
                }
            }
            curr = curr.next;
        }
        return head;
    }
    public static void main(String[] args){
        Node head = null;
        head = insertAtEnd(head, 10);
        head = insertAtEnd(head, 10);
        head = insertAtEnd(head, 10);
        head = insertAtEnd(head, 10);
        head = insertAtEnd(head, 10);
        printLL(head);
        int target  = 10;
        head = deleteAllOccurences(head,target);
        printLL(head);

    }
}
