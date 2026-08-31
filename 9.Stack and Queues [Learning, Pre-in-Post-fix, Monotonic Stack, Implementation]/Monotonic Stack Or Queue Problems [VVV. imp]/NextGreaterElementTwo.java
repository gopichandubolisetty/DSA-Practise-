import java.util.Stack;

class MonotonicStack{
    public static int[] nextGreat(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(nums[n-1]);
        for(int i=0;i<2;i++){
            int j = n-1;
            while(j>=0){
                while(!st.isEmpty() && nums[j]>=st.peek()){
                    st.pop();
                }
                if(!st.isEmpty()){
                    ans[j]=st.peek();
                }else{
                    ans[j]=-1;
                }
                st.push(nums[j]);
                j--;
            }
        }
        return ans;
    }
}

//     import java.util.Stack;

// class MonotonicStack {
//     public static int[] nextGreat(int[] nums) {
//         int n = nums.length;
//         int[] ans = new int[n];
//         Stack<Integer> st = new Stack<>();
        
//         // Loop from 2n - 1 down to 0
//         for (int i = 2 * n - 1; i >= 0; i--) {
//             // Modulo operator handles the wrap-around automatically
//             int index = i % n;
            
//             // Maintain the monotonic decreasing stack
//             while (!st.isEmpty() && nums[index] >= st.peek()) {
//                 st.pop();
//             }
            
//             // The answer logic
//             if (!st.isEmpty()) {
//                 ans[index] = st.peek();
//             } else {
//                 ans[index] = -1;
//             }
            
//             // Push the current element onto the stack
//             st.push(nums[index]);
//         }
//         return ans;
//     }

public class NextGreaterElementTwo {
    public static void main(String[] args){
        int[] nums = {3, 10, 4, 2, 1, 2, 6, 1, 7, 2, 9};
        int[] ans = MonotonicStack.nextGreat(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
