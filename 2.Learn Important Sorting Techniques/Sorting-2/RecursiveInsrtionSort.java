public class RecursiveInsrtionSort {

    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args){
        int[] arr = {4,515,235,36,25,18,3};
        int n = arr.length;
        insertionSort(arr,n-1);
        printArray(arr);    
    }

    public static void insertionSort(int[] arr,int n){

        if(n<=1){
            return;
        }

        insertionSort(arr,n-1);
        
        int j = n;
        int temp = arr[n];
            while(j>0 && temp<arr[j-1]){
                arr[j]=arr[j-1];j--;
            }
            arr[j] = temp;
        }
    }
