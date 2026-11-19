import java.util.HashMap;
import java.util.Map;

public class SecondHighestElementInAnArray {

    public static int secondMostFrequentElement(int[] nums) {
        Map<Integer, Integer> fM = new HashMap<>();
        for (int num : nums) {
            fM.put(num, fM.getOrDefault(num, 0) + 1);
        }
        int max1 = 0, max2 = 0;
        int ele1 = -1, ele2 = -1;

        for (Map.Entry<Integer, Integer> entry : fM.entrySet()) {
            int ele = entry.getKey();
            int freq = entry.getValue();

            if (freq > max1) {
                max2 = max1;
                ele2 = ele1;
                max1 = freq;
                ele1 = ele;
            } else if (freq == max1) {
                ele1 = Math.min(ele1, ele);
            } else if (freq > max2) {
                max2 = freq;
                ele2 = ele;
            } else if (freq == max2) {
                ele2 = Math.min(ele2, ele);
            }
        }
        return ele2;
    }

    public static void main(String[] args) {
        System.out.println(secondMostFrequentElement(new int[]{1, 2, 2, 3, 3, 3})); // 2
        System.out.println(secondMostFrequentElement(new int[]{4, 4, 5, 5, 6, 7})); // 6
        System.out.println(secondMostFrequentElement(new int[]{1, 1, 2, 2}));       // -1 (no second highest)
        System.out.println(secondMostFrequentElement(new int[]{5}));                // -1 (single element)
        System.out.println(secondMostFrequentElement(new int[]{}));                 // -1 (empty array)
    }
}