import java.util.Scanner;
public class SwapingTwoNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+" "+b+"Before Swapping");
        int temp;
        temp = b;
        b=a;
        a=temp;
        System.out.println(a+" "+b+"After Swapping");
        sc.close();
    }
}
