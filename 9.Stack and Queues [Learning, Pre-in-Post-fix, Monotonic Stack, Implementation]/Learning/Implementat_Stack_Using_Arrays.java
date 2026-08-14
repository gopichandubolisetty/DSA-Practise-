import java.util.Arrays;
import java.util.List;

class ArrayStack {
    private int[] arrayStack;
    private int topindex;
    private int capacity;

    public ArrayStack(int n) {
        this.capacity = n;
        this.arrayStack = new int[n];
        this.topindex = -1;
    }

    public ArrayStack() {
        this(1000);
    }

    public void push(int x) {
        if (topindex >= capacity - 1) {
            System.out.println("Stack overflow");
            return;
        }
        arrayStack[++topindex] = x;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arrayStack[topindex--];
    }

    public int top() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arrayStack[topindex];
    }

    public boolean isEmpty() {
        return topindex == -1;
    }
}

public class Implementat_Stack_Using_Arrays {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack();
        List<String> commands = Arrays.asList("ArrayStack", "push", "push", "top", "pop", "isEmpty");
        List<List<Integer>> inputs = Arrays.asList(
            Arrays.asList(), 
            Arrays.asList(5), 
            Arrays.asList(10), 
            Arrays.asList(), 
            Arrays.asList(), 
            Arrays.asList()
        );

        for (int i = 0; i < commands.size(); i++) {
            switch (commands.get(i)) {
                case "push":
                    stack.push(inputs.get(i).get(0));
                    System.out.print("null ");
                    break;
                case "pop":
                    System.out.print(stack.pop() + " ");
                    break;
                case "top":
                    System.out.print(stack.top() + " ");
                    break;
                case "isEmpty":
                    System.out.print(stack.isEmpty() + " ");
                    break;
                case "ArrayStack":
                    System.out.print("null ");
                    break;
            }
        }
        System.out.println();
    }
}