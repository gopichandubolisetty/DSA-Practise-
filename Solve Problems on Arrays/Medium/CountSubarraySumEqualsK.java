import java.util.*;

public class CountSubarraySumEqualsK {

    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {3,1,2,4};
        int k=6;
        int sum=0;
        int count=0;
        int len = arr.length;
        HashMap<Integer,Integer> m = new HashMap<>();
        m.put(0,1);
        for(int i=0;i<len;i++){
            sum=sum+arr[i];
            int rem = sum-k;
            if(m.containsKey(rem)){
                count+=m.get(rem);
            }

            m.put(sum,m.getOrDefault(sum, 0) + 1);
        }
        System.out.println(count);
    }
}







        //         while(p2<len || sum>=k){
//             if(sum<k){
//                 sum+=arr[p2];
//                 p2++;
//             }
//             if(sum==k){
//                 count++;
//             }
//             if(sum>=k){
//                 sum-=arr[p1];
//                 p1++;
//             }
//         }
//         System.out.println(count);