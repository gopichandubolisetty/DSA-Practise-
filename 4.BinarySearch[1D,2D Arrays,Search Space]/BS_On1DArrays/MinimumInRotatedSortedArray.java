public class MinimumInRotatedSortedArray {
    public static void main(String[] args){
        int[] nums = {11,13,15,17};
        int length = nums.length;
        int left = 0;int right = length-1;
        int min=Integer.MAX_VALUE;
        while(left<right){
            int mid = left+(right-left)/2;
            if(min>nums[mid]){
                min = nums[mid];
            }

            if(nums[left]<=nums[mid]){
                min = Math.min(min,nums[left]);
                left=mid+1;
            }else if(nums[mid]<nums[right]){
                min = Math.min(min,nums[mid]);
                right=mid-1;
            }
        }
        System.out.println(min);
    }
}
