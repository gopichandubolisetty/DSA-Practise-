public class LongestRepeatingCharacterReplacement {
    
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int left = 0;
        int maxCount = 0;
        int maxLength = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            count[currentChar - 'A']++;
            
            // Track the frequency of the most frequent character in the current window
            maxCount = Math.max(maxCount, count[currentChar - 'A']);
            
            // If the number of characters we need to replace exceeds k, 
            // shrink the window from the left
            if ((right - left + 1) - maxCount > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }
            
            // Update the maximum length found so far
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }

    public static void main(String[] args) {
        LongestRepeatingCharacterReplacement solver = new LongestRepeatingCharacterReplacement();
        
        // Test Case 1
        String s1 = "ABAB";
        int k1 = 2;
        System.out.println("Test 1: Input: s = \"" + s1 + "\", k = " + k1);
        System.out.println("Output: " + solver.characterReplacement(s1, k1)); // Expected: 4
        
        System.out.println();

        // Test Case 2
        String s2 = "AABABBA";
        int k2 = 1;
        System.out.println("Test 2: Input: s = \"" + s2 + "\", k = " + k2);
        System.out.println("Output: " + solver.characterReplacement(s2, k2)); // Expected: 4
    }
}