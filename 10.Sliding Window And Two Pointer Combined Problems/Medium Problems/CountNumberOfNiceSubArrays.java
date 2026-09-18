public class CountNumberOfNiceSubArrays {
    public static int numberOfSubarrays(int[] nums, int k) {
        int count = 0;
        int n = nums.length;
        int[] prefixCount = new int[n + 1];
        prefixCount[0] = 1;
        int currentOdds = 0;
        
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 != 0) {
                currentOdds++;
            }
            if (currentOdds >= k) {
                count += prefixCount[currentOdds - k];
            }
            prefixCount[currentOdds]++;
        }
        
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 1, 1};
        int k = 3;
        int result = numberOfSubarrays(nums, k);
        System.out.println(result);
    }
}