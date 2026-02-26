import java.util.*;

public class LargestSubArrayWithSumZero {
    public static void main(String[] args){
        int[] nums = {6, -2, 2, -8, 1, 7, 4, -10}  ;
        int n = nums.length;
        HashMap<Integer,Integer> m = new HashMap<>();
        int sum =0;int maxlen=0;
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
            if(sum==0){
                maxlen=i+1;
            }

            if(m.containsKey(sum)){
                int len = i- m.get(sum);
                maxlen = Math.max(len,maxlen);
            }else if(!m.containsKey(sum)){
                m.put(sum,i);
            }
        }

        System.out.println(maxlen);
        System.out.println(m);
    }
}
