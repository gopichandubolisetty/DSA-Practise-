public class CountReverseArray {
    public static void main(String[] args){
        int[] nums= {1,3,2,3,1};
        int length = nums.length;
        int count =0;
       for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[i] > 2 * nums[j])
                    count++;
            }
        }
        System.out.println(count);
    }
}
