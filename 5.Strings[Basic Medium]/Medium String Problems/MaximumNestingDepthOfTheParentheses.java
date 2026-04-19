public class MaximumNestingDepthOfTheParentheses {
    public static int maxDepth(String s) {
    int count = 0; 
    int max = 0;
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == '(') {
            count++;
            max = Math.max(max, count); 
        } else if (s.charAt(i) == ')') {
            count--;
        }
    }
    return max;
}
public static void main(String[] args){
    String ch ="(1+(2*3)+((8)/4))+1";
    System.out.println(maxDepth(ch));
}
}
