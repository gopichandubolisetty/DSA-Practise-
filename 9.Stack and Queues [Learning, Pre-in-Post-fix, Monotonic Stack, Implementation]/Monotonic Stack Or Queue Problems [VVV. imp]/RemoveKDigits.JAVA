import java.util.*;

public class RemoveKDigits {
    public String removeKdigits(String num, int k) {
        Deque<Character> st = new ArrayDeque<>();
        
        for (int i = 0; i < num.length(); i++) {
            char current = num.charAt(i);
            while (k > 0 && !st.isEmpty() && st.peek() > current) {
                st.pop();
                k--;
            }
            st.push(current);
        }
        
        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }
        
        StringBuilder s1 = new StringBuilder();
        while (!st.isEmpty()) {
            s1.append(st.pop());
        }
        
        String s2 = s1.reverse().toString();

        int startIndex = 0;
        while (startIndex < s2.length() && s2.charAt(startIndex) == '0') {
            startIndex++;
        }
        
        s2 = s2.substring(startIndex);
        
        return s2.isEmpty() ? "0" : s2;
    }

    public static void main(String[] args) {
        RemoveKDigits solver = new RemoveKDigits();
        String num = "1432219";
        int k = 3;
        String result = solver.removeKdigits(num, k);
        System.out.println(result);
    }
}