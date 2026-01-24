public class RecursiveBubbleSort {

   
    public static void recur(int[] arr, int n) {
    
        if (n == 1) {
            return;
        }

    
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                // Swap arr[i] and arr[i+1]
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        recur(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {21, 6, 853, 8, 3, 8736, 87, 3, 45, 2, 4, 2};
        int n = arr.length;

        System.out.println("Array before sorting: ");
        printArray(arr);

       
        recur(arr, n);

        System.out.println("\nArray after sorting: ");
        printArray(arr);
    }


    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}