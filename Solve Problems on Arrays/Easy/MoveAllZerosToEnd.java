public class MoveAllZerosToEnd {

    public static void printArray(int[] n){
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] arr =  {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        int n = arr.length;
        int c =0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[c] = arr[i];
                c++;
            }
        }
        while(c<n){
            arr[c]=0;
            c++;
        }
        printArray(arr);
    }
}


                                                                    // Own Methods

        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n-i-1;j++){
        //         if(arr[j]==0){
        //             int temp=arr[j];
        //             arr[j]=arr[j+1];
        //             arr[j+1]=temp;
        //         }
        //     }
        // }