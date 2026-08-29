import java.util.Stack;

class PostfixToInfix {
    public String postfixToInfix(String postfix) {
        Stack<String> s = new Stack<>();
        int n = postfix.length();

        for (int i = 0; i < n; i++) {
            char c = postfix.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                s.push(String.valueOf(c));
            } else {
                String op2 = s.pop();
                String op1 = s.pop();
                s.push("(" + op1 + c + op2 + ")");
            }
        }

        return s.peek();
    }
}

public class PostfixToInfixConversion {
    public static void main(String[] args) {
        PostfixToInfix converter = new PostfixToInfix();
        String postfix = "AB*C+";
        System.out.println("Infix Expression: " + converter.postfixToInfix(postfix));
    }
}