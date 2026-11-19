import java.util.Scanner;

public class EulersPHIFuncion {

    public static int phi(int n) {
        int r = n;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                while (n % i == 0) {
                    n /= i;
                }
                r -= r / i;
            }
        }
        if (n > 1) {
            r -= r / n;
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(phi(n));
        sc.close();
    }
}