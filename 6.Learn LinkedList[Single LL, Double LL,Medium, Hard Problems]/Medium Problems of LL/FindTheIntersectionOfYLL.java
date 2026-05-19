class Node{
    int data;
    Node next;

    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}


public class FindTheIntersectionOfYLL {

    public static Node YIntersection(Node h1,Node h2){
        Node dum1 = h1;
        Node dum2 = h2;

        while(dum1!=dum2){
            if(dum1==null){
                dum1=h2;
            }else{
                dum1=dum1.next;
            }

            if(dum2==null){
                dum2=h1;
            }else{
                dum2=dum2.next;
            }
        }
        return dum1;
    }
    public static void main(String[] args) {
        Node common = new Node(8);
        common.next = new Node(4);
        common.next.next = new Node(5);

        Node h1 = new Node(4);
        h1.next = new Node(1);
        h1.next.next = common;

        Node h2 = new Node(5);
        h2.next = new Node(6);
        h2.next.next = new Node(1);
        h2.next.next.next = common;

        Node intersection = YIntersection(h1, h2);

        if (intersection != null) {
            System.out.println("Intersected at '" + intersection.data + "'");
        } else {
            System.out.println("No intersection");
        }
    }
}
