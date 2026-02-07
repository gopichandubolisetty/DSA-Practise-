import java.util.Arrays;
public class TwoSum {
    public static String Twosum(int[] arr,int n,int sum){
        int left=0;
        int right=n-1;
        while(left<right){
            int chsum = arr[left]+arr[right];
            if(chsum==sum){
                return "Found";
            }else if (chsum<sum){
                left++;
            }else{
                right--;
            }
        }
        return "Not Found";
    }
    public static void main(String[] args){ 
        int[] arr = {2,6,5,8,11};
        Arrays.sort(arr);
        int n =14;
        int len = arr.length;
        String check = Twosum(arr,len,n);
        System.out.println(check);

    }
}




                                                            //Brute Force Approach
// for(int i=0;i<len;i++){
//             if(!check){
//                 for(int j=i+1;j<len;j++){
//                 if((arr[i]+arr[j])==n && check==false){
//                     System.out.println("The indexes are at ind1: "+i+" ind2: "+j);
//                     check=true;
//                 }
//             }
//         }
//     }