public class Fibonacci_Number {
    public static void main(String[] args){
        int a =0;
        int b=1;
        int n=6;
        System.out.print(a+" "+b+" ");
        while(n>2){
            int temp = a+b;
            a=b;
            b=temp;
            System.out.print(temp+" ");
            n--;
        }
    }
}
