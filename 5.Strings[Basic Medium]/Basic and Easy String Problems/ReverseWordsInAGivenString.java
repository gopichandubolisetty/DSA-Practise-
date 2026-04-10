public class ReverseWordsInAGivenString {
    public static void main(String[] args) {
        String input = "  the sky  is blue  ";
        String result = reverseWords(input);
        
        System.out.println("Original: \"" + input + "\"");
        System.out.println("Reversed: \"" + result + "\"");
    }

    public static String reverseWords(String s) {
        if (s == null) return null;
        
        String[] words = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i > 0) {
                result.append(" ");
            }
        }
        
        return result.toString();
    }
}