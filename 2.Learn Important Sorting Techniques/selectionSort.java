// class selectionSort{
//     public static void main(String[] args){
//         int[] arr = {13,46,24,52,9,20,9};
//         for(int i=0;i<arr.length-1;i++){
//             int min=i;
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[min]>arr[j]){
//                     min=j;
//                 }
//             }
//             int temp = arr[i];
//             arr[i]=arr[min];
//             arr[min]=temp;
//         }

//         for(int i=0;i<arr.length;i++){
//             System.out.println(arr[i]+" ");
//         }
//     }
// }

class selectionSort{
    public static void main(String[] args){
        int[] arr = {1,5,7,6,3,47,7,2};
        int n = arr.length;
        for(int i=0;i<n;i++){
            int ind=i;
            for(int j=1;j<n;j++){
                if(arr[j]<arr[i]){
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