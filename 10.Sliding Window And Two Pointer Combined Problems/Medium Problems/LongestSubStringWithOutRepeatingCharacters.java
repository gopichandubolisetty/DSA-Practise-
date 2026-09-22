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









//  int ans =0;
//         int left =0;
//         boolean ar = new boolean[26];

//         for(int right = 0;right<s.length();right++){
//             if(ar[s.charAt(right)-'a']){
//                 while(left<right && ar[s.charAt(right)-'a']){
//                     ar[s.charAt(left)-'a'] = false;
//                     left++;
//                 }
//             }
//             ar[s.charAt(right)-'a'] = true;
//             ans = Math.max(ans,right-left+1);
//         }
//         return ans;