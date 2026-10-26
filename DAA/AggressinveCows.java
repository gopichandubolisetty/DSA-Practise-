import java.util.Arrays;
import java.util.Scanner;

public class AggressinveCows {
    public static boolean compare(int[] arr,int k,int dist){
        int count =1;
        int lastPosition = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-lastPosition>=dist){
                lastPosition=arr[i];
                count++;
                if(count==k){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int ans=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int low=0;
        int high = arr[n-1]-arr[0];
        while(low<=high){
            int mid = low+(high-low)/2;
            if(compare(arr,k,mid)){
                ans = mid;
                low = mid+1;
            }else{
                high= mid-1;
            }
        }
        System.out.println(ans);
    }
}
