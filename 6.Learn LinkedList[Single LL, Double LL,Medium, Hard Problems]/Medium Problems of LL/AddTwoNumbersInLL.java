class Node {
    int data;
    Node next;

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class AddTwoNumbersInLL {

    public static Node createList(int[] arr) {
        Node head = new Node(arr[0]);
        Node temp = head;
        for (int i = 1; i < arr.length; i++) {
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        return head;
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static Node AddLL(Node L1,Node L2){
        Node ans = new Node(0);
        Node current= ans;
        int carry =0 ;
        while(L1!=null || L2!=null || carry!=0 ){
            int val1 = (L1!=null) ? L1.data : 0;
            int val2 = (L2!=null) ? L2.data :0;
            int sum = val1+val2+carry;
            carry = sum/10;
            current.next = new Node(sum%10);
            current = current.next;

            if(L1!=null)L1 = L1.next;
            if(L2!=null) L2 = L2.next;

        }
        return ans.next;
    }

    public static void main(String[] args){
        int[] n1 = {2,3,4,5,6,7};
        int[] n2 = {3,4,1,4,2,5};
        Node L1 = createList(n1);
        Node L2 = createList(n2);

        Node ans = AddLL(L1,L2);
        printList(ans);
    }
}