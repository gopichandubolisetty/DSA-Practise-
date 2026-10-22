import java.util.Stack;

public class SumOfSubArrayMinimums {
    public static int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        long mod = 1_000_000_007L;
        
        int[] left = new int[n];
        int[] right = new int[n];
        
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            left[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());
            stack.push(i);
        }
        
        stack.clear();
        
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            right[i] = stack.isEmpty() ? (n - i) : (stack.peek() - i);
            stack.push(i);
        }
        
        long totalSum = 0;
        for (int i = 0; i < n; i++) {
            long contribution = (long) arr[i] * left[i] * right[i] % mod;
            totalSum = (totalSum + contribution) % mod;
        }
        
        return (int) totalSum;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        System.out.println(sumSubarrayMins(arr));
    }
}