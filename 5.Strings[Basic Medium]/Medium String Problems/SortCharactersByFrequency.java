import java.util.*;

public class SortCharactersByFrequency {
    public List<Character> frequencySort(String s) {
        int[][] freq = new int[26][2];

        for (int i = 0; i < 26; i++) {
            freq[i][1] = i + 'a';
        }

        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a'][0]++;
            }
        }

        Arrays.sort(freq, (a, b) -> {
            if (a[0] != b[0]) {
                return b[0] - a[0];
            }
            return a[1] - b[1];
        });

        List<Character> ans = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            if (freq[i][0] > 0) {
                ans.add((char) freq[i][1]);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        SortCharactersByFrequency sorter = new SortCharactersByFrequency();
        String input = "tree";
        List<Character> result = sorter.frequencySort(input);

        for (char c : result) {
            System.out.print(c + " ");
        }
    }
}