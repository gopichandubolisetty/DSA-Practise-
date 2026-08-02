public class SwapTwoNumbers {
    public static void main(String[] args){
        int a = 90,b=45;
        System.out.println(a+" "+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a+" "+b);
    }
}
