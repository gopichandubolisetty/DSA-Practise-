import java.util.Arrays;

public class ReverseAString {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        ReverseAString obj = new ReverseAString();
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        obj.reverseString(s);
        System.out.println(Arrays.toString(s));
    }
}