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

public class RemoveDuplicatesFromSortedDLL {

    Node head = null;

    public  void insertAtEnd(int value){
        Node newNode = new Node(value);

        if(head==null){
            head = newNode;
            return;
        }

        Node current = head;
        while(current.next!=null){
            current=current.next;
        }

        current.next = newNode;
        newNode.prev = current;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + (temp.next != null ? " <-> " : ""));
            temp = temp.next;
        }
        System.out.println();
    }


    public static void removeDuplicates(Node head){

        if(head==null || head.next==null){
            return ;
        }

        Node current = head;
        while(current!=null && current.next!=null){
            if(current.data==current.next.data){
                current.next= current.next.next;
                if(current.next!=null){
                    current.next.prev = current;
                }
            }else{
                current=current.next;
            }
        }
    }
    public static void main(String[] args){
        RemoveDuplicatesFromSortedDLL list = new RemoveDuplicatesFromSortedDLL();

        list.insertAtEnd(1);
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(3);
        list.insertAtEnd(3);

        System.out.print("Original List: ");
        list.printList();

        removeDuplicates(list.head);

        System.out.print("After Removing Duplicates: ");
        list.printList();
        

    }
}
