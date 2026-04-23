class IntroductionToSingleLinkedList {
    int data;
    IntroductionToSingleLinkedList next;

    IntroductionToSingleLinkedList(int data1,IntroductionToSingleLinkedList next1){
        this.data = data1;
        this.next = next1;
    }
    
    IntroductionToSingleLinkedList(int data1){
        this.data = data1;
        this.next=null;
    }
}

class Main{
    public static void main(String[] args){
        int[] arr ={1,2,3,4,5,6};

        IntroductionToSingleLinkedList n1 = new IntroductionToSingleLinkedList(arr[0]);

        System.out.println(n1.next);

        IntroductionToSingleLinkedList n2 = new IntroductionToSingleLinkedList(arr[1]);

        n1.next = n2;

        System.out.println(n2);
        System.out.println(n1.next);
    }
}