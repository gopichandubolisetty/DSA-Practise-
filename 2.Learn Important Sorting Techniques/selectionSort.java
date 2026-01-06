class selectionSort{
    public static void main(String[] args){
        int[] arr = {13,46,24,52,9,20,9};
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}