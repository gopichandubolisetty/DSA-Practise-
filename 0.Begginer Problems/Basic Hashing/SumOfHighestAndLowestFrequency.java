import java.util.HashMap;
import java.util.Map;

public class SumOfHighestAndLowestFrequency {

    public static int sumHighestAndLowestFrequency(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Map<Integer, Integer> fM = new HashMap<>();
        for (int num : nums) {
            fM.put(num, fM.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        int minFreq = Integer.MAX_VALUE;

        for (int freq : fM.values()) {
            maxFreq = Math.max(maxFreq, freq);
            minFreq = Math.min(minFreq, freq);
        }

        return maxFreq + minFreq;
    }

    public static void main(String[] args) {
        System.out.println(sumHighestAndLowestFrequency(new int[]{1, 2, 2, 3, 3, 3}));
        System.out.println(sumHighestAndLowestFrequency(new int[]{4, 4, 5, 5, 6}));
        System.out.println(sumHighestAndLowestFrequency(new int[]{7, 7, 7}));
    }
}