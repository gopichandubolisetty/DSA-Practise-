public class UpperBound {
    public static void main(String[] args){
        int[] nums = {3, 5, 8, 9, 15, 19};
        int low=0;
        int high = nums.length-1;
        int ans =nums.length;
        int target = 9;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]>target){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        System.out.println("The answer is : "+ ans);
    }
}
