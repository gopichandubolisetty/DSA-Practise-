public class FindRepatingAndMissingNumber {

    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] nums = {3,5,4,1,1};
        int length = nums.length;
        for(int i=0;i<length;i++){
            int temp = nums[nums[i]-1];
            nums[nums[i]-1] = nums[i];
            nums[i] = temp;
        }

        for(int i=0;i<length;i++){
            if(nums[i]!=i+1){
                System.out.print("The Repeated number is "+nums[i]+" and the missing number is "+(i+1));
            }
        }
    }
}
