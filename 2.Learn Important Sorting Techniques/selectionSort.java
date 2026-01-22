class selectionSort{
    public static void main(String[] args){
        int[] arr = {1,5,7,6,3,47,7,2};
        int n = arr.length;
        if(n==0){
            System.out.println("The size of the array is "+n);
            return;
        }
        if(n==1){
            System.out.println("The size of the array is "+n);
            System.out.println(arr[0]);
            return;
        }
        for(int i=0;i<n-1;i++){
            int ind=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[ind]){
                   ind =j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[ind];
            arr[ind]=temp;
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}