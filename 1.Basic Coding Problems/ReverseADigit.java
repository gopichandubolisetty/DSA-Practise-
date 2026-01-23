import java.util.Scanner;

public class ReverseADigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev=0;
        System.out.println("Number before reversing : "+n);
        while(n>0){
            rev = rev*10+n%10;
            n/=10;
        }
        System.out.println("Reversed Number is : "+rev);
        sc.close();
    }
}
