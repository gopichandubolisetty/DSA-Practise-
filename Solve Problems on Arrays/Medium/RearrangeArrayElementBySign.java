public class RearrangeArrayElementBySign {

    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] nums = {1,2,-4,-5};
        int len = nums.length;
        int p1=0;
        while(p1<len){
            
        }
        printArray(nums);
    }
}




                            // BruteForce Method
// int[] pos = new int [len/2];int po=-1;int ne=-1;
//         int[] neg = new int[len/2];
//         for(int i=0;i<len;i++){
//             if(nums[i]<0){
//                 ne++;
//                 neg[ne] = nums[i];
//             }else{
//                 po++;
//                 pos[po]=nums[i];
//             }
//         }
//         for(int i=0;i<len;i++){
//             if(i%2==0){
//                 nums[i]=pos[i/2];
//             }else{
//                 nums[i]=neg[i/2];
//             }
//         }
//         // printArray(pos);
//         // printArray(neg);