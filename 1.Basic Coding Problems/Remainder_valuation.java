import java.util.Scanner;

public class Remainder_valuation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int rem = n1%n2;
        System.out.println("Remainder is : "+rem);
        sc.close();
    }
}
