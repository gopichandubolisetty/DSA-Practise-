public class MaximumSubArraySum {
    public static void main(String[] args){
        int[] nums = {10, 10, -5, -20, 1};
        int sum=0;int max=Integer.MIN_VALUE;
        int start=-1;
        int ind1=-1;
        int ind2=-1;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(sum==0){
                start=i;
            }
            sum+=nums[i];
            if(sum>max){
                max=sum;
                ind1=start;
                ind2=i;
            }
            if(sum<0){
                sum=0;
            }
        }
        System.out.println("The maximum subarray sum in the array is : "+max+" ind1: "+ind1+" ind2: "+ind2);
        System.out.print("The sub array is : ");
        for(int i=ind1;i<=ind2;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
