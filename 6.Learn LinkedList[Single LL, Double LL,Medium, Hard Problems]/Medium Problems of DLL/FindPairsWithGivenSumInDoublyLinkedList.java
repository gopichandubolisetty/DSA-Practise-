import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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




public class FindPairsWithGivenSumInDoublyLinkedList {

    public static List<List<Integer>> findPairs(Node head,int tar){
        Node left = head;
        List<List<Integer>> result = new ArrayList<>();

        if(head==null){
            return result;
        }

        Node right  = head;
        while(right.next!=null){
            right=right.next;
        }

        while(left!=right && right.next!=left){
            int cur = left.data+right.data;

            if(cur == tar){
                result.add(Arrays.asList(left.data,right.data));

                left = left.next;
                right = right.prev;
            }else if(cur<tar){
                left = left.next;
            }else{
                right = right.prev;
            }
        }

        return result;
    }
    
    public static void printLL(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" <->");
            curr=curr.next;
        }
        System.out.println("null");
    }

    public static Node convertArrayToDLL(int[] arr) {
        if (arr.length == 0) return null;

        Node head = new Node(arr[0]);
        Node prevNode = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], prevNode, null);
            prevNode.next = temp;
            prevNode = temp;
        }

        return head;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 8, 9};
        int target = 7;

        Node head = convertArrayToDLL(arr);

        System.out.print("Doubly Linked List: ");
        printLL(head);

        List<List<Integer>> pairs = findPairs(head, target);

        System.out.println("Pairs with sum " + target + ": " + pairs);
    }
}
