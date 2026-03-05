import java.util.*;

public class LongestSubArrayWithSumKPostiveAndNegative {
    public void printArray(int[] n,int l){
        for(int i=0;i<l;i++){
            System.out.print(n[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] arr = {1,-2,-3,0,3,2,2,3};
        int sum = 0;
        int curr=0;
        int max =0;
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            curr=curr+arr[i];
            if(curr==sum){
                max=i+1;
            }
            int rem = curr-sum;
            if(m.containsKey(rem)){
                int len = i-m.get(rem);
                max = Math.max(max,len);
            }
            if(!m.containsKey(curr)){
                m.put(curr,i);
            }
        }

        System.out.println(max+" "+m);
    }
}




                                                    // Brute force approach
// int len = arr.length;
//         if(len==0){return;}else if(len==1 && sum==arr[0]){
//             System.out.println("The sum is at : "+0);
//         }
//         int ind1=-1;
//         int ind2=-1;
//         for(int i=0;i<len;i++){
//             int comp=arr[i];
//             for(int j=i+1;j<len;j++){
//                 comp+=arr[j];
//                 if(comp==sum && (ind2-ind1)<(j-i)){
//                     ind1=i;ind2=j;
//                 }
//             }
//             if(ind1==-1 && ind2==-1 && arr[i]==sum){
//                 ind1=i;ind2=i;
//             }
//         }
//         System.out.println("The indexes start from ind1: "+ind1+" ind2:"+ind2);