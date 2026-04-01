import java.util.*;
public class SplitArrayLargestSum {
    public static int count(int[] nums,int maxsum){
        int sum = 0;
        int count=1;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>maxsum){
                count++;
                sum=nums[i];
            }
        }
        return count;
    }
    public int splitArray(int[] nums, int k) {
        int low = Arrays.stream(nums).max().getAsInt();
        int high = Arrays.stream(nums).sum();
        while(low<=high){
            int mid = (low+high)/2;
            int countpart = count(nums,mid);
            if(countpart>k){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;
    }


    public static void main(String[] args){
        int[] a = {10, 20, 30, 40};
        int k = 2;
        SplitArrayLargestSum sp = new SplitArrayLargestSum();
        int ans = sp.splitArray(a,k);
        System.out.println("The answer is: " + ans);
    }
}
