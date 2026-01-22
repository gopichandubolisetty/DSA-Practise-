public class bubbleSort {
    public static void main(String[] args){
        int[] arr = {13,46,24,52,20,9};
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            boolean check = false;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    check=true;
                }

                if(!check){
                    break;
                }
            }
        }


        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}