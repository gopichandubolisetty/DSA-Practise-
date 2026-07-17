import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PowerSet {

    public static List<String> getSubsequences(String str) {
        List<String> result = new ArrayList<>();
        generate(str, 0, "", result);
        Collections.sort(result);
        return result;
    }

    private static void generate(String str, int index, String current, List<String> result) {
        if (index == str.length()) {
            if (!current.isEmpty()) {
                result.add(current);
            }
            return;
        }

        generate(str, index + 1, current + str.charAt(index), result);
        generate(str, index + 1, current, result);
    }

    public static void main(String[] args) {
        System.out.println(getSubsequences("abc"));
        System.out.println(getSubsequences("aa"));
    }
}