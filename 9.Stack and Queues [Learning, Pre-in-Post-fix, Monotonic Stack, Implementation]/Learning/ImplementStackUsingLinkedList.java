class Node{
    int val;
    Node next = null;
    Node(int n){
        this.val = n;
        this.next = null;
    }
}

class LinkedListStack{
    private Node head;
    private int size;

    public void push(int n){
        Node nod = new Node(n);
        nod.next = head;
        head= nod;
        size++;
    }

    public int top(){
        if(head==null){
            return -1;
        }
        return head.val;
    }

    public boolean isEmpty(){
        return (size==0);
    }

    public int pop(){
        int val = head.val;
        Node temp = head;
        head=head.next;
        temp.next=null;
        size--;
        return val;
    }

}

public class ImplementStackUsingLinkedList {
    public static void main(String[] args) {
        // Creating a stack
        LinkedListStack st = new LinkedListStack();

        // Array of commands
        String[] commands = {"LinkedListStack", "push", "push", 
                             "pop", "top", "isEmpty"};
        // Array of inputs
        int[][] inputs = {{}, {3}, {7}, {}, {}, {}};

        for (int i = 0; i < commands.length; ++i) {
            if (commands[i].equals("push")) {
                st.push(inputs[i][0]);
                System.out.print("null ");
            } else if (commands[i].equals("pop")) {
                System.out.print(st.pop() + " ");
            } else if (commands[i].equals("top")) {
                System.out.print(st.top() + " ");
            } else if (commands[i].equals("isEmpty")) {
                System.out.print((st.isEmpty() ? "true" : "false") + " ");
            } else if (commands[i].equals("LinkedListStack")) {
                System.out.print("null ");
            }
        }
    }
}
