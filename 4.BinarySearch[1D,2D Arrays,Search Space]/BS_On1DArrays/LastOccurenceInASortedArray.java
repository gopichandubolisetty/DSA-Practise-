public class LastOccurenceInASortedArray {
    public static void main(String[] args){
        int[] nums = {3, 4, 13, 13, 13, 20, 40};
        int length = nums.length;
        int target = 13;int ans=-1;
        int start = 0 ; int end = length-1;
        while(start<end){
            int mid = (start+end)/2;
            if(nums[mid]==target){
                ans = mid;
                start = mid+1;
            }else if(nums[mid]>target){
                end=mid-1;
            }else{
                start = mid+1;
            }
        }
        if(ans!=-1){
            System.out.println("The last occurence of the target is : "+ans);
        }else{
            System.out.println("The target is not in the array");
        }
    }   
}
