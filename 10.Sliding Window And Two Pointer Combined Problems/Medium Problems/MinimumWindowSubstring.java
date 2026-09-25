import java.util.HashMap;

public class MinimumWindowSubstring {
    public static String minWindow(String s, String t) {
        HashMap<Character, Integer> cu = new HashMap<>();
        HashMap<Character, Integer> re = new HashMap<>();
        
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            re.put(ch, re.getOrDefault(ch, 0) + 1);
        }
        
        int sI = 0, eI = 0, form = 0, left = 0;
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            cu.put(ch, cu.getOrDefault(ch, 0) + 1);

            if (re.containsKey(ch) && re.get(ch).intValue() == cu.get(ch).intValue()) {
                form++;
            }

            while (left <= i && form == re.size()) {
                char chi = s.charAt(left);
                
                if (i - left + 1 < min) {
                    min = i - left + 1;
                    sI = left;
                    eI = i;
                }

                cu.put(chi, cu.get(chi) - 1);
                
                if (re.containsKey(chi) && cu.get(chi) < re.get(chi)) {
                    form--;
                }
                
                left++;
            }
        }
        
        return min == Integer.MAX_VALUE ? "" : s.substring(sI, eI + 1);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String result = minWindow(s, t);
        System.out.println("Minimum Window Substring: " + result);
    }
}