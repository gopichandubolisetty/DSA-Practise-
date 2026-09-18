public class BinarySubarraysWithSum {
    
    public static int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }
    
    private static int atMost(int[] nums, int goal) {
        if (goal < 0) {
            return 0;
        }
        int left = 0, currentSum = 0, count = 0;
        for (int right = 0; right < nums.length; right++) {
            currentSum += nums[right];
            while (currentSum > goal) {
                currentSum -= nums[left];
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 0, 1};
        int goal = 2;
        int result = numSubarraysWithSum(nums, goal);
        System.out.println("Number of subarrays: " + result);
    }
}