import java.util.*;

public class CountNumberOfSubStrings {
    public static void main(String[] args) {
        String str = "pqpqs";
        int k = 2;
        int result = atMost(str, k) - atMost(str, k - 1);
        System.out.println(result);
    }

    public static int atMost(String str, int k) {
        int len = str.length();
        int left = 0, right = 0, count = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        while (right < len) {
            char rChar = str.charAt(right);
            map.put(rChar, map.getOrDefault(rChar, 0) + 1);

            while (map.size() > k) {
                char lChar = str.charAt(left);
                map.put(lChar, map.get(lChar) - 1);
                if (map.get(lChar) == 0) {
                    map.remove(lChar);
                }
                left++;
            }
            
            count += right - left + 1;
            right++;
        }
        return count;
    }
}