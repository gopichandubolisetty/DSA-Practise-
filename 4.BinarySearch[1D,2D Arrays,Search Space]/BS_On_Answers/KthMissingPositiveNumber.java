public class KthMissingPositiveNumber {
    public static void main(String[] args){
        int[] nums = {4,7,9,10};
        int k = 1;
        int length = nums.length-1;
        int low = 0;int high=length;
        while(low<=high){
            int mid = (low+high)/2;

            int missing = nums[mid] - (mid+1);

            if(missing<k){
                low=mid+1;
            }else{
                high=mid-1;
            }

        }

        System.out.println("The missing number is:  "+(k+high+1));
    }    
}
