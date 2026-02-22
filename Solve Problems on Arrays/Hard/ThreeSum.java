import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args){
        int[] nums = {-1,0,1,2,-1,-4};
        Arrays.sort(nums);
        int length = nums.length;
        for(int i=0;i<length-2;i++){
            int p1=i+1;
            int p2=length-1;
            while(p1<p2){
                    int sum = nums[i]+nums[p1]+nums[p2];
                    if(sum==0){
                        System.out.println("The numbers are "+nums[i]+" "+nums[p1]+" "+nums[p2]);
                         while (p1<p2 && nums[p1] == nums[p1 - 1]) p1++;
                         while (p1<p2 && nums[p2]==nums[p2-1]) p2--;
                         p1++;
                         p2--;
                    }else if(sum<0){
                        p1++;
                    }
                    p2--;
                }
        }
    }
}
