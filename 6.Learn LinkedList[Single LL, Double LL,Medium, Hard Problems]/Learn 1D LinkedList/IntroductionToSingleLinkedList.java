class IntroductionToSingleLinkedList {
    int data;
    IntroductionToSingleLinkedList next;

    IntroductionToSingleLinkedList(int d1, IntroductionToSingleLinkedList next1) {
        this.data = d1;
        this.next = next1;
    }

    IntroductionToSingleLinkedList(int d1) {
        this.data = d1;
        this.next = null;
    }
}

class Main {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 7};

        IntroductionToSingleLinkedList y = new IntroductionToSingleLinkedList(arr[0]);

        System.out.println(y);
        System.out.println(y.data);
    }
}