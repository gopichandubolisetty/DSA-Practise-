import java.util.Stack;
class Solution{

    public static int prec(char c){
        if( c == '^'){
            return 3;
        }else if(c=='*' || c == '/'){
            return 2;
        }else if(c=='+' || c=='-'){
            return 1;
        }
        return -1;
    }

    public static void infixToPrefix(String s){
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                ans.append(ch);
            }else if(ch=='('){
                st.push(ch);
            }else if(ch==')'){
                while(st.peek()!='('){
                    ans.append(st.pop());
                }
                st.pop();
            }else{  // I used another if else if(prec(Ch)>prec(st.peek())){st.push()}
                while(!st.isEmpty() && prec(ch)<prec(st.peek())){
                    ans.append(st.pop());
                }
                st.push(ch);
            }
        }
            while(!st.isEmpty()){
                ans.append(st.pop());
            }
        
        System.out.println("Answer is "+ans.toString());
    }
}



public class InfixToPostfix {
    public static void main(String[] args){
        String exp = "(p+q)*(m-n)";  
        System.out.println("Infix expression: " + exp);
        Solution.infixToPrefix(exp);
    }
}
