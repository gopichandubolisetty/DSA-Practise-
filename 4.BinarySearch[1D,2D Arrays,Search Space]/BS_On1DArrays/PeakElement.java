public class PeakElement {
    public static void main(String[] args){
        int[] nums = {1, 2, 1, 3, 5, 6, 4};
        int length = nums.length;
        int left = 0;
        int right = length-1;
        while(left<right){
            int mid = left+(right-left)/2;

            if(nums[mid]>nums[mid+1]){
                right=mid;
            }else{
                left=mid+1;
            }
        }

        System.out.println("The peak element in the array is : "+nums[left]);
    }
}
