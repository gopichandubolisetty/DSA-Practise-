public class SortAnArrayof0s1s2s {
    public static void main(String[] args){
        int[] nums = {1,0,2,1,0};
        int len = nums.length;
        int one =0;
        int ze =0;
        int two=0;
        
    }
}



                                                //    Brute Force Approach
// for(int i=0;i<len;i++){
//             int check = nums[i];
//             if(check == 0){
//                 ze++;
//             }else if (check==1){
//                 one++;
//             }else {
//                 two++;
//             }
//         }
//         int ind =0;
//         for(int i=0;i<ze;i++){
//             nums[ind]=0;
//             ind++;
//         }
//         for(int j=0;j<one;j++){
//             nums[ind]=1;
//             ind++;
//         }
//         for(int i=0;i<two;i++){
//             nums[ind]=2;
//             ind++;
//         }
//         for(int i=0;i<len;i++){
//             System.out.print(nums[i]+" ");
//         }