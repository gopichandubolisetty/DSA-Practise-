import java.util.Arrays;

public class LongestSubStringWithOutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int[] hash = new int[256];
        Arrays.fill(hash, -1);
        
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < n; right++) {
            char currentChar = s.charAt(right);

            if (hash[currentChar] != -1) {
                left = Math.max(left, hash[currentChar] + 1);
            }

            maxLen = Math.max(maxLen, right - left + 1);
            hash[currentChar] = right;
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String input1 = "abcabcbb";
        String input2 = "bbbbb";
        String input3 = "pwwkew";

        System.out.println(lengthOfLongestSubstring(input1));
        System.out.println(lengthOfLongestSubstring(input2));
        System.out.println(lengthOfLongestSubstring(input3));
    }
}