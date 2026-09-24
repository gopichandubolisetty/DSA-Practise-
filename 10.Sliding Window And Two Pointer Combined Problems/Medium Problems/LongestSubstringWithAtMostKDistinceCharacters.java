import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithAtMostKDistinceCharacters {
    public int longestSubstringAtMostKDistinct(String s, int k) {
        int n = s.length();

        if (n == 0 || k <= 0) {
            return 0;
        }

        Map<Character, Integer> frequency = new HashMap<>();
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < n; right++) {
            char current = s.charAt(right);
            frequency.put(current, frequency.getOrDefault(current, 0) + 1);

            while (frequency.size() > k) {
                char leftChar = s.charAt(left);
                frequency.put(leftChar, frequency.get(leftChar) - 1);

                if (frequency.get(leftChar) == 0) {
                    frequency.remove(leftChar);
                }

                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "eceba";
        int k = 2;

        LongestSubstringWithAtMostKDistinceCharacters solution = new LongestSubstringWithAtMostKDistinceCharacters();

        System.out.println(
            solution.longestSubstringAtMostKDistinct(s, k)
        );
    }
}