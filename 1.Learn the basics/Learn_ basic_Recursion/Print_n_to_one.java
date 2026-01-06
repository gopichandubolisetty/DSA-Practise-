public class Print_n_to_one {
    public static void main(String[] args){
        printN(156);
    }

    public static void printN(int n){
        if(n==0){return;}
        System.out.print(n+" ");
        printN(n-1);
    }
}
