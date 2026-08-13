class ArrayStack {
    private int[] stackArray;
    private int capacity;
    private int topIndex;

    public ArrayStack() {
        this(1000);
    }

    public ArrayStack(int size) {
        this.capacity = size;
        this.stackArray = new int[capacity];
        this.topIndex = -1;
    }

    public void push(int x) {
        if (topIndex >= capacity - 1) {
            System.out.println("Stack overflow");
            return;
        }
        stackArray[++topIndex] = x;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[topIndex--];
    }

    public int top() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[topIndex];
    }

    public boolean isEmpty() {
        return topIndex == -1;
    }
}

public class Implementat_Stack_Using_Arrays {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack();
        String[] commands = {"ArrayStack", "push", "push", "top", "pop", "isEmpty"};
        int[][] inputs = {{}, {5}, {10}, {}, {}, {}};

        for (int i = 0; i < commands.length; ++i) {
            switch (commands[i]) {
                case "push":
                    stack.push(inputs[i][0]);
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