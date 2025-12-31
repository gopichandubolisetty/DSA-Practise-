public class Print_one_to_n {
    public static void main(String[] args){
        printN(55,1);
    }

    public static void printN(int n,int st){
        if(st>n){
            return;
        }
        System.out.print(st+" ");
        printN(n,st+1);
    }
}
