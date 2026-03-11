public class SingleElementInASortedArray {
    public static void main(String[] args){
        int[] nums = {1,1,2,2,3,3,4,5,5,6,6};
        int length = nums.length;
        int ans=nums[0];
        int left =0 ;
        int right = length-1;
        int mid = left+(right-left)/2;
        while(left<=right){
            mid = left + (right-left)/2;

            if (nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1]) {
                break;
            }

            if((mid % 2 == 1 && nums[mid] == nums[mid - 1]) ||
                (mid % 2 == 0 && nums[mid] == nums[mid + 1])){
                    left = mid+1;
                }else{
                     right= mid-1;
                }
        }
        System.out.println(nums[mid]);
    }
}




                    // Brute Force
// for(int i=1;i<length;i++){
//             ans=ans^nums[i];
//         }
//         System.out.println(ans);