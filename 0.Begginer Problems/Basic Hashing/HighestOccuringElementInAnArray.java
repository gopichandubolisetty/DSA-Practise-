import java.util.Arrays;

public class HighestOccuringElementInAnArray {
    public static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);

        int left = 0;
        long currentSum = 0;
        int maxFreq = 0;

        for (int right = 0; right < nums.length; right++) {
            long target = nums[right];
            currentSum += target;

            if (target * (right - left + 1) - currentSum > k) {
                currentSum -= nums[left];
                left++;
            }

            maxFreq = Math.max(maxFreq, right - left + 1);
        }

        return maxFreq;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 4};
        int k1 = 5;
        System.out.println(maxFrequency(nums1, k1));

        int[] nums2 = {1, 4, 8, 13};
        int k2 = 5;
        System.out.println(maxFrequency(nums2, k2));

        int[] nums3 = {3, 9, 6};
        int k3 = 2;
        System.out.println(maxFrequency(nums3, k3));
    }
}