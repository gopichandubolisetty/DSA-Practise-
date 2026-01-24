// Malli tirigi vastha

public class QuickSort {

    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] arr = {54,4,3,4,3,4,6,55,2,4,525,2};
        int n = arr.length;
        int low =0;
        int high = n-1;
        int pivot = n-1;
        for(int i=0;i<n;i++){
            if(arr[i]<arr[pivot]){
                low = i;
                break;
            }
        }

        for(int j=high;j>=0;j--){
            if(arr[j]>arr[pivot]){
                high = j;
                break;
            }
        }

        if(low>=high){
            int temp = arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
        }else{
            int temp = arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
        }

        for(int i=0;i<n;i++){
            if(arr[i]>arr[high]){
                low = i;
                break;
            }
        }

        for(int j=high;j>=0;j--){
            if(arr[j]<arr[high]){
                high = j;
                break;
            }
        }

        if(low>=high){
            int temp = arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
        }else{
            int temp = arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
        }

        printArray(arr);
    }
}
