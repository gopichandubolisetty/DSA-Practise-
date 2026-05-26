import java.util.*;
public class ReverseAStackUsingRecursion {

    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }

        int topval = s.pop();

        reverseStack(s);

        insertAtBottom(s,topval);
    }

    public static void insertAtBottom(Stack<Integer> s,int val){
        if(s.isEmpty()){
            s.push(val);
            return ; 
        }
        int topval = s.pop();
         insertAtBottom(s,topval);
         s.push(val);
    }
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(4);
        st.push(1);
        st.push(3);
        st.push(2);
        reverseStack(st);

        while(!st.isEmpty()){
            System.out.println(st.pop()+" ");
        }
    }
}
