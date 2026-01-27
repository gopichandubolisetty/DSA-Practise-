public class LeftRotateAnArrayByDPlaces {

    public static void printArray(int[] n){
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
    }

    public static void main(String[] args){
        int[] arr ={1,2,3,4,5,6,7};
        int d = 4;int n = arr.length;
        int p1=0;int p2=d-1;
        while(p2<n){
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2]=temp;
            p1++;p2++;
        }

        printArray(arr);
    }
}


// int[] arr =  {1, 2, 3, 4, 5, 6, 7};
//         int n = arr.length-1;
//         int k =7;
//         int i =0;
//         k=k%(n+1);
//         while(i<k){
//             int temp = arr[n];
//             int j=n;
//             while(j>0){
//                 arr[j]=arr[j-1];
//                 j--;
//             }
//             arr[0]=temp;
//             i++;
//         }
//         printArray(arr);