import java.util.*;

public class CountTheNumberOfSubArraysWithGivenXORK {
    public static void main(String[] args){
        int[] nums = {5, 6, 7, 8, 9};
        int len = nums.length;
        int k = 5;int count=0;
        int sum=0;
        HashMap<Integer,Integer> m = new HashMap<>();
        m.put(0, 1);
        for(int i=0;i<len;i++){
            sum=sum^nums[i];
            int rem = sum^k;
            if(m.containsKey(rem)){
                count+=m.get(rem);
            }
            m.put(sum,m.getOrDefault(sum, 0) + 1);
        }
        System.out.println(count);
    }
}
