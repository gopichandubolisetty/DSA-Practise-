class Node{
    int data;
    Node next;

    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}




public class AddOneToANumberRepresentedByLL {
    
     public static void printLL(Node head){
         Node curr = head;
         while(curr!=null){
            System.out.print(curr.data);
            System.out.print("->");
            curr = curr.next;
         }
         System.out.println("null");
    }

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


    public static Node addOne(Node head){
        head = reverseLL(head);
        Node temp = head;
        int carry =1;
        while(temp!=null){
            int sum = temp.data+carry;
            temp.data=sum%10;
            carry = sum/10;

            if(temp.next==null && carry>0){
                temp.next = new Node(carry);
                carry =0;
                break;
            }
            temp = temp.next;
        }
        return reverseLL(head);
    }
    public static void main(String[] args){
        Node head = new Node(1);
        head.next = new Node(5);
        head.next.next = new Node(2);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(1);
        printLL(head);
        addOne(head);
        printLL(head);
    }
}
