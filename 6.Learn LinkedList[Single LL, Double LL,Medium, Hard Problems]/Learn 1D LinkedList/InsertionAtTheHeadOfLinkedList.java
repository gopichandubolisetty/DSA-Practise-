public class InsertionAtTheHeadOfLinkedList {
    int data;
    InsertionAtTheHeadOfLinkedList next;


    InsertionAtTheHeadOfLinkedList(int data1, InsertionAtTheHeadOfLinkedList next1) {
        this.data = data1;
        this.next = next1;
    }

    InsertionAtTheHeadOfLinkedList(int data1) {
        this.data = data1;
        this.next = null;
    }

    // Static methods for operations
    public static void display(InsertionAtTheHeadOfLinkedList head) {
        InsertionAtTheHeadOfLinkedList temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static InsertionAtTheHeadOfLinkedList insertHead(int val, InsertionAtTheHeadOfLinkedList head) {
        return new InsertionAtTheHeadOfLinkedList(val, head);
    }

   
    public static void main(String[] args) {
        InsertionAtTheHeadOfLinkedList head = new InsertionAtTheHeadOfLinkedList(10);
        head.next = new InsertionAtTheHeadOfLinkedList(20);
        
        System.out.print("Before: ");
        display(head);
        
        head = insertHead(5, head);
        
        System.out.print("After:  ");
        display(head);
    }
}