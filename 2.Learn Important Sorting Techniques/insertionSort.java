// public class insertionSort {
//     public static void main(String[] args){
//         int[] arr = {21,85,2,5,32,5,87,2,7};
//         int n = arr.length;
//         for(int i=1;i<n;i++){
//             int temp =arr[i];
//             if(temp<arr[i-1]){
//                 for(int j=0;j<i;j++){
//                     if(temp<arr[j]){
//                         int temp2 = arr[j];
//                         arr[j]=temp;
//                         temp=temp2;
//                     }
//                 }
//                 arr[i]=temp;
//             }
//         }

//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }

public class insertionSort {
    public static void main(String[] args){
        int[] arr = {21,51,5,3,5,1,2,5,3,8,3,45};
        int n = arr.length;
        for(int i=1;i<n;i++){
            int temp = arr[i];
            int j =i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }

            arr[j+1] = temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}