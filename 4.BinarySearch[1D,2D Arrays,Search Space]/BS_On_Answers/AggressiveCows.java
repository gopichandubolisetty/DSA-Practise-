import java.util.Arrays;

public class AggressiveCows {
    
    public static boolean canPlace(int[] stalls, int k, int dist) {
        int countCows = 1;
        int lastPos = stalls[0];
        
        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPos >= dist) {
                countCows++;
                lastPos = stalls[i];
            }
            if (countCows >= k) return true;
        }
        return false;
    }

    public static int solve(int[] stalls, int k) {
        Arrays.sort(stalls);
        int n = stalls.length;
        int low = 1;
        int high = stalls[n - 1] - stalls[0];
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (canPlace(stalls, k, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] stalls = {1, 2, 8, 4, 9};
        int k = 3;
        System.out.println(solve(stalls, k));
    }
}