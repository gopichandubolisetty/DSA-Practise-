

public class UnderstandRecursion {
    public static void main(String[] args){
        int n =56;
        Printn(n);
    }
    public static void Printn(int n){
        if(n==0){
           return;
        }
        System.out.print(n+" ");
         Printn(n-1);
     }
}
