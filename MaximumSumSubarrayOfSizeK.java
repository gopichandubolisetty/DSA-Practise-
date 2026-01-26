public class MaximumSumSubarrayOfSizeK {
    public static void main(String[] args){
        int[] nums = {2, 1, 5, 1, 3, 2};
        int n = nums.length;
        int k =3;
        int p1=0;
        int end =0;
        int p2=3;
        int sum = 0;
        if(k>n){
            return;
        }
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int maxsum=sum;
        while(p2<n){
            sum+=nums[p2];
            sum-=nums[p2-k];
            if(sum>maxsum){
                maxsum = sum;
                p1=p2-k+1;
                end=p2;
            }
            p2++;
        }
        System.out.println(p1+" "+end);
    }
}
