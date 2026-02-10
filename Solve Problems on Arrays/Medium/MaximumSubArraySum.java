public class MaximumSubArraySum {
    public static void main(String[] args){
        int[] nums = {2, 3, 5, -2, 7, -4};
        int sum=0;int max=Integer.MIN_VALUE;
        int ind1=0;int ind2=-1;
        int n = nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            System.out.println("sum: "+sum);
            if(sum>max){
                ind1=ind2;
                ind2=i;
                max=sum;
                System.out.println("max:"+max);
            }
        }
        System.out.println("The maximum subarray sum in the array is : "+max+" ind1: "+ind1+" ind2: "+ind2);
    }
}
