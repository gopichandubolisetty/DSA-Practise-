import java.util.Arrays;
import java.util.Stack;
public class StockSpanProblem {
    public static int[] span(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] span = new int[n];

        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[i]>=arr[st.peek()]){
                st.pop();
            }
            
            if(st.isEmpty()){
                span[i]=i+1;
            }else{
                span[i]=i-st.peek();
            }

            st.push(i);
        }
        return span;
    }
    public static void main(String[] args){
        int[] prices = {100,80,60,70,60,75,85};
        System.out.println(Arrays.toString(StockSpanProblem.span(prices)));
    }
}
