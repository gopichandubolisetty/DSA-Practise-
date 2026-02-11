public class StcokBuyAndSell {
    public static void main(String[] args){
        int[] nums = {7,1,5,3,6,4};
        int n = nums.length;
        int buy = Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<n;i++){
            if(nums[i]<buy){
                buy=nums[i];
            }else if((profit<(nums[i]-buy))){
                profit = nums[i] - buy;
            }
        }
        System.out.println("The maximum profit is :"+profit);
    }
}
