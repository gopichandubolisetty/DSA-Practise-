public class SearchXInSortedArray {
    public static void main(String[] args){
        int[] nums = {3,4,6,7,9,12,16,17};
        int length = nums.length;
        int tar = 6;
        int end = length;
        int start =0;
        while(start<end){
            int mid = (start+end)/2;
            if(nums[mid]==tar){
                System.out.println("The targer found at index: "+mid);
                break;
            }else if(tar>nums[mid]){
                start = mid+1;
            }else{
                end=mid+1;
            }
        }
    }
}
