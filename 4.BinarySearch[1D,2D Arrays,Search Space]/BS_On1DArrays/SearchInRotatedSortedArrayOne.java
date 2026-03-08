public class SearchInRotatedSortedArrayOne {
    public static void main(String[] args){
        int[] nums = {4,5,6,7,0,1,2};
        int length = nums.length;
        int ans = -1;
        int k=0;
        int left=0;int right=length-1;
        while(left<=right){
            int mid = (left+right)/2;
            
            if(nums[mid]==k){
                ans=mid;
                break;
            }

            if(nums[left]<nums[mid]){
                if(nums[left]<=k && k<nums[mid]){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }else{
                if(nums[mid]<k && k<=nums[right] ){
                    left=mid+1;
                }else{
                    right=mid-1;
                }
            }
        }

        System.out.println(ans);
    }
}
