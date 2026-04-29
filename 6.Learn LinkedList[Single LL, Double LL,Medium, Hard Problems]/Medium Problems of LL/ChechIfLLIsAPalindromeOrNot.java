class Node{
    int data;
    Node next;

    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}


public class ChechIfLLIsAPalindromeOrNot {
    
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

    public static boolean isPalindrome(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node newhead = reverseLL(slow);
        fast = newhead;
        slow=head;
        while(fast!=null){
            if(slow.data==fast.data){
                slow = slow.next;
                fast = fast.next;
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Node head = new Node(1);
        head.next = new Node(5);
        head.next.next = new Node(2);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(1);

        if (isPalindrome(head)) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
    
    }
}

