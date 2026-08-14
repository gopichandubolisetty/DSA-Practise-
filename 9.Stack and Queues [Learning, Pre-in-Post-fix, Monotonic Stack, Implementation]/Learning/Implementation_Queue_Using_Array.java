class Queue{
    private int[] Queue;
    private int capacity;
    private int start,end,currsize;
    
    public Queue(){
        this.Queue = new int[10];
        this.start = -1;
        this.end = -1;
        this.currsize=0;
        this.capacity = 10;
    }

    public void push(int n){
        if(currsize==capacity){
            System.out.println("Queue is full");
        }

        if(end==-1){
            start=0;end=0;
        }else{
            end=(end+1)%capacity;
        }

        Queue[end]=n;
        currsize++;
    }

    public int pop(){
        if(start==-1){
            return -1;
        }

        int val = Queue[start];
        if(currsize==1){
            start=-1;end=-1;
        }else{
            start=(start+1)%capacity;
        }

        currsize--;
        return val;
    }

    public int peek(){
        if(currsize==-1){
            System.out.println("The queue is empty");
            return -1;
        }
        return Queue[start];
    }

    public boolean isEmpty(){
        if(currsize==0){
            return true;
        }
        return false;
    }
}
public class Implementation_Queue_Using_Array {
    public static void main(String[] args) {
        Queue queue = new Queue();

        String[] commands = {"ArrayQueue", "push", "push","peek", "pop", "isEmpty"};
        int[][] inputs = {{}, {5}, {10}, {}, {}, {}};

        for (int i = 0; i < commands.length; ++i) {
            switch (commands[i]) {
                case "push":
                    queue.push(inputs[i][0]);
                    System.out.print("null ");
                    break;
                case "pop":
                    System.out.print(queue.pop() + " ");
                    break;
                case "peek":
                    System.out.print(queue.peek() + " ");
                    break;
                case "isEmpty":
                    System.out.print(queue.isEmpty() ? "true " : "false ");
                    break;
                case "ArrayQueue":
                    System.out.print("null ");
                    break;
            }
        }
    }
}
