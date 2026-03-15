
public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] nums = {7, 15, 6, 3};
        int h = 8;
        
        int max = 0;
        for (int num : nums) {
            if (num > max) max = num;
        }
        
        int min = 1; 
        int ans = max;

        while (min <= max) {
            int mid = min + (max - min) / 2;
            long totalHours = 0;
            
            for (int pile : nums) {
                totalHours += (pile + mid - 1) / mid;
            }

            if (totalHours <= h) {
                ans = mid;
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        
        System.out.println(ans);
    }
}