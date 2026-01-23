public class FactorialOfANumber {
    public static void main(String[] args){
        System.out.println("Factorial number is : "+ factN(5));
    }

    public static int factN(int n){
        if(n==0){
            return 1;
        }
        return n*factN(n-1);
    }
}
