public class SearchInsertPosition {
    public static void main(String[] args){
        int[] nums = {1, 2, 4, 7};
        int length = nums.length;
        int ans = length;
        int target = 6;
        int low=0;
        int high = length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]>=target){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        System.out.println("The answer is at index: "+ans);
    }
}
