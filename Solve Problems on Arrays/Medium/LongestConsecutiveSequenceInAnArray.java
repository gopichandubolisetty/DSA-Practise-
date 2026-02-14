import java.util.*;

public class LongestConsecutiveSequenceInAnArray{

    public static void PrintArray(int[] arr,int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] nums = {100,4,200,1,3,2};
        int length = nums.length;
        Arrays.sort(nums);
        PrintArray(nums,length);
        int count =0;
        for(int i=0;i<length;i++){
            if((nums[i]+1)==(nums[i+1])){
                count++;
            }else{
                break;
            }
        }
        count++;
        System.out.println("The count is : "+count);
        PrintArray(nums,count);
    }
}
