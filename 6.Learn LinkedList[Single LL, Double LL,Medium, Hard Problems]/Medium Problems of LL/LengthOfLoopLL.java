class Node{
    int data;
    Node next;

    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}



public class LengthOfLoopLL {
    
     public static Node startLoop(Node head){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }

    public static int lengthLL(Node sn){
        int l =0 ;
        Node temp = sn ;
        while(temp.next!=sn){
            l++;
            temp=temp.next;
        }
        return l;
    }
    
    public static void main(String[] args){

        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = third;

        Node start = startLoop(head);
        if(start==null){
            System.out.println("There is no startin point");
        }else{
            System.out.println("The starting point is : " + start);
        }

        int len = lengthLL(start);
        System.out.println("The length of the loop is : "+len);
    }

}
