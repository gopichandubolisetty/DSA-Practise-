import java.util.*;
public class LongestSubArrayWithZero {
    public static void main(String[] args){
        int[] nums = {9,-3,3,-1,6,-5};
        int length = nums.length;
        int ind1=-1,ind2=-1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<length;i++){
            map.put(i,nums[i]);
        }
        System.out.println(map);
    }
}


                                                                    // Brute Force Approach
// for(int i=0;i<length-1;i++){
        //     int sum=nums[i];
        //     if(sum==0){
        //         System.out.println("The sub array with ind1: "+ind1+" ind2: "+ind2);
        //     }
        //     for(int j=i+1;j<length;j++){
        //         sum=sum+nums[j];
        //         if(sum==0){
        //             System.out.println("The indexes are at "+i+" "+(j));
        //             if(j-i > ind2-ind1){ind1=i;ind2=j;}
        //         }
        //     }
        // }
        // System.out.println("The longest array indexes are at ind1: "+ind1+" ind2: "+ind2);