public class NextPermutation {

    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void reverseArray(int[] arr,int st,int en){
        int p1=st;int p2=en;
        while(p1<p2){
            int temp = arr[p1];
            arr[p1]=arr[p2];
            arr[p2]=temp;
            p1++;p2--;
        }
    }
    public static void main(String[] args){
        int[] arr = {1,3,2};
        int n = arr.length-2;
        int len = arr.length-1;
        while(n>=0 && arr[n]>=arr[n+1]){
            n--;
        }
        if(n>=0){
            while(arr[len]<=arr[n]){
                len--;
            }
            System.out.println("Len: "+len+" "+"n: "+n);
            int temp = arr[n];
            arr[n]=arr[len];
            arr[len]=temp;
        }
        reverseArray(arr,n+1,arr.length-1);
        printArray(arr);
    }
}
