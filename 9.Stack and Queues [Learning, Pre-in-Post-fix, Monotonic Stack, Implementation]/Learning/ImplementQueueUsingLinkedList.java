class Node{
    int val;
    Node next;

    Node(int n){
        this.val = n;
        this.next = null;
    }
}

class LinkedListQueue{
    private Node head;
    private int size;
    private Node tail;

    public LinkedListQueue(){
        head=tail=null;
        size=0;
    }

    public void push(int x){
        Node ele = new Node(x);
        if(head==null){
            head=ele;
            tail=ele;
        }else{
            tail.next=ele;
            tail=ele;
        }
        size++;
    }

    public int pop(){
        if(size==0){
            return -1;
        }

        int value = head.val;
        Node temp = head;
        head = head.next;
        temp = null;
        return value;
    }

    public int peek(){
        if(head==null){
            return -1;
        }

        return head.val;
    }

    public boolean isEmpty(){
        return (size==0);
    }
}

public class ImplementQueueUsingLinkedList {
    public static void main(String[] args){
        LinkedListQueue q = new LinkedListQueue();
        String[] commands = {"LinkedListQueue", "push", "push","peek", "pop", "isEmpty"};
        int[][] inputs={{}, {3}, {7}, {}, {}, {}};;

         for (int i = 0; i < commands.length; ++i) {
            if (commands[i].equals("push")) {
                q.push(inputs[i][0]);
                System.out.print("null ");
            } else if (commands[i].equals("pop")) {
                System.out.print(q.pop() + " ");
            } else if (commands[i].equals("peek")) {
                System.out.print(q.peek() + " ");
            } else if (commands[i].equals("isEmpty")) {
                System.out.print((q.isEmpty() ? "true" : "false") + " ");
            } else if (commands[i].equals("LinkedListQueue")) {
                System.out.print("null ");
            }
        }
    }
}
