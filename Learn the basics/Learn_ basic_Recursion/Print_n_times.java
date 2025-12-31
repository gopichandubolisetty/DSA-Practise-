public class Print_n_times {
    public static void main(String[] args){
        printName("Gopi",44);
    }

    public static void printName(String name,int n){
        if(n==0){
            return;
        }
        System.out.print(name+" ");
        printName(name,n-1);
    }
}
