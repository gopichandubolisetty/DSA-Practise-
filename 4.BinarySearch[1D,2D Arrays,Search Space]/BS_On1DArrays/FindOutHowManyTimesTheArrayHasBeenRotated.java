public class FindOutHowManyTimesTheArrayHasBeenRotated {
    public static void main(String[] args){
        int[] nums = {4,5,6,7,0,1,2,3};
        int length = nums.length;
        int left = 0;int right = length-1;
        
        while(left<right){
            int mid = left+(right-left)/2;

            if(nums[mid]>nums[right]){
                left = mid+1;
            }else{
                right=mid;
            }
        }

        System.out.println(left);
    }
}




// if(nums[mid]<min){
//                 min = nums[mid];
//                 ind = mid;
//             }

//             if(nums[left]<=nums[mid]){
//                 if(nums[left]<min){
//                     min=nums[left];
//                     ind=left;
//                 }
//                 left=mid+1;
//             }else {
//                 if(nums[mid]<min){
//                     min=nums[mid];
//                     ind=mid;
//                 }
//                 right=mid-1;
//             }