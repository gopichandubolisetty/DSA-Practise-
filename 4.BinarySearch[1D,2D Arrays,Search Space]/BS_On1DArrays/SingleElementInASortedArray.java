public class SingleElementInASortedArray {
    public static void main(String[] args){
        int[] nums = {1,1,2,2,3,3,4,5,5,6,6};
        int length = nums.length;
        int ans=nums[0];
        for(int i=1;i<length;i++){
            ans=ans^nums[i];
        }
        System.out.println(ans);
    }
}
