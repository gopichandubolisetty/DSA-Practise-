public class FindTheSmallestDivisorGivenATreshHold {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5};
        int length = nums.length;
        int k = 8,sum=0;
        int min = 1;int max=nums[0];
        int ans=-1;
        for(int i=0;i<length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            sum+=nums[i];
        }

        while(min<max){
            int mid = (max+min)/2;

            long div = 0;
            for (int num : nums) {
                div += (num + mid - 1) / mid; 
            }

            if(div<=k){
            ans=mid;
                max=mid-1;
            }else if(div>k){
                min=mid+1;
            }
        }

        System.out.println("The answer is the: "+ans);
    }    
}
