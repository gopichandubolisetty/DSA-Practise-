import java.util.LinkedList;
import java.util.Queue;
class QueueStack{
    Queue<Integer> q = new LinkedList<>();

    public void push(int x){
        int size = q.size();
        q.add(x);
        for(int i=0;i<size;i++){
            q.add(q.poll());
        }
    }

    public int pop(){
        return q.poll();
    }

    public int top(){
        return q.peek();
    }

    public boolean isEmpty(){
        return q.isEmpty();
    }
}


public class ImplementStackUsingSingleQueue {
    public static void main(String[] args) {
        QueueStack st = new QueueStack();
        
        // Array of commands
        String[] commands = {"QueueStack", "push", "push", "pop", "top", "isEmpty"};
        int[][] inputs = {{}, {4}, {8}, {}, {}, {}};

        for (int i = 0; i < commands.length; ++i) {
            switch (commands[i]) {
                case "push":
                    st.push(inputs[i][0]);
                    System.out.print("null ");
                    break;
                case "pop":
                    System.out.print(st.pop() + " ");
                    break;
                case "top":
                    System.out.print(st.top() + " ");
                    break;
                case "isEmpty":
                    System.out.print(st.isEmpty() ? "true " : "false ");
                    break;
                case "QueueStack":
                    System.out.print("null ");
                    break;
            }
        }
    }

}
