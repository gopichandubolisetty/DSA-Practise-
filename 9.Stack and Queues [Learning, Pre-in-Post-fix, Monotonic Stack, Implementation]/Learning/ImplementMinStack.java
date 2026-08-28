import java.util.Stack;

class MinStack {

    private Stack<Long> st;
    private long mini;

    public MinStack() {
        st = new Stack<>();
    }

    public void push(int val) {
        long value = val;
        if (st.isEmpty()) {
            mini = value;
            st.push(value);
        } else if (value >= mini) {
            st.push(value);
        } else {
            st.push(2 * value - mini);
            mini = value;
        }
    }

    public void pop() {
        if (st.isEmpty()) return;

        long x = st.pop();
        if (x < mini) {
            mini = 2 * mini - x;
        }
    }

    public int top() {
        if (st.isEmpty()) return -1;

        long x = st.peek();
        if (x >= mini) {
            return (int) x;
        }

        return (int) mini;
    }

    public int getMin() {
        return (int) mini;
    }
}

public class ImplementMinStack {
    public static void main(String[] args) {
        MinStack s = new MinStack();

        s.push(-2);
        s.push(0);
        s.push(-3);
        System.out.println(s.getMin());
        s.pop();
        System.out.println(s.top());
        System.out.println(s.getMin());
    }
}