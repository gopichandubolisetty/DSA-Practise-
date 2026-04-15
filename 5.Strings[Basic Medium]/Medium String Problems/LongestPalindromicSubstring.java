public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        int maxLength = 0;
        String longestSubstring = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String currentSubstring = s.substring(i, j + 1);

                if (isPalindrome(currentSubstring)) {
                    if (currentSubstring.length() > maxLength) {
                        maxLength = currentSubstring.length();
                        longestSubstring = currentSubstring;
                    }
                }
            }
        }

        return longestSubstring;
    }

    private boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        LongestPalindromicSubstring solver = new LongestPalindromicSubstring();
        System.out.println(solver.longestPalindrome("babad")); // Output: "bab" or "aba"
    }
}