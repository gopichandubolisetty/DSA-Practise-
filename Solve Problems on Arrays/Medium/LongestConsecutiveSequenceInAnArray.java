public class LongestConsecutiveSequenceInAnArray {

    public static void PrintArray(int arr,int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static int CalculateCount(int[] arr){
        int num=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                num++;
            }else{
                return num;
            }
        }
        System.out.println();
        return num;
    }

    public static void main(String[] args){
        int[] nums = {100,4,200,1,3,2};
        int length = nums.length;
        int max =nums[0];
        for(int i=0;i<length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        int[] newarray = new int[max];
        for(int i=0;i<length;i++){
            newarray[nums[i]-1] = nums[i];
        }
        int count = CalculateCount(newarray);
        System.out.println(count);
    }
}
