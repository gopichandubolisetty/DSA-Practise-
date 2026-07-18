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

        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        return head;
    }

    public static Node deleteOccurenece(Node head,int tar){
        if(head==null){
            return head;
        }
        Node temp = head;
        while(temp.next!=null){
            if(temp.data==tar){
                Node temp1 = temp.prev;
                temp1.next= temp.next;
                
            }
        }
        return head;
    }
    
    public static void main(String[] args){
        Node head = null;
        head = insertAtEnd(head, 10);
        head = insertAtEnd(head, 20);
        head = insertAtEnd(head, 30);
        head = insertAtEnd(head, 10);
        head = insertAtEnd(head, 40);
        int target  = 10;
    }
}
