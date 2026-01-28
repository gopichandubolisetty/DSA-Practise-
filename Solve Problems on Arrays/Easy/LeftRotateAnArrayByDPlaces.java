public class LeftRotateAnArrayByDPlaces {

    public static void printArray(int[] n){
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        } System.out.println();
    }

    public static void reverseArray(int[] arr,int st,int end){
        while(st<end){
            int temp = arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
            st++;
            end--;
        }
    }

    public static int[] rotateArray(int[] nums,int k,String direction){
        int n = nums.length;
        k=k%n;
        if(n==0 || k==0) {
            return nums;
        }
        if(direction.equals("right")){
            reverseArray(nums,0,n-1);
            reverseArray(nums,0,k-1);
            reverseArray(nums,k,n-1);
        }else if(direction.equals("left")){
            reverseArray(nums,0,k-1);
            reverseArray(nums,k,n-1);
            reverseArray(nums,0,n-1);
        }
        return nums;
    }

    public static void main(String[] args){
        int[] arr ={1,2,3,4,5,6,7};
        int d = 4;
        int n = arr.length;
        d=d%n;
        System.out.print("Array before reversing: ");
        printArray(arr);
        rotateArray(arr,d,"left");
        System.out.print("Array after reversing: ");
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