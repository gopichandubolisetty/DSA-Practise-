import java.util.Arrays;

public class FourSum {
    public static void main(String[] args){
        int[] nums = {1,0,-1,0,-2,2};
        Arrays.sort(nums);
        int length = nums.length;
        for(int i=0;i<length-1;i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for(int j=length-1;j>i;j--){
                if (j < length - 1 && nums[j] == nums[j + 1]) continue;

                int p1=i+1;int p2=j-1;
                while(p1<p2){
                    int sum = nums[i]+nums[j]+nums[p1]+nums[p2];
                    if(sum==0){
                        System.out.println("The numbers are "+nums[i]+" "+nums[j]+" "+nums[p1]+" "+nums[p2]);
                        while(p1<p2 && nums[p1]==nums[p1+1]){
                            p1++;
                        }
                        while(p2>p1 && nums[p2]==nums[p2-1]){
                            p2--;
                        }
                        p1++;
                        p2--;
                    }else if(sum<0){
                        p1++;
                    }else{
                        p2--;
                    }
                }
            }
        }
    }
}
