public class PowerXForN {
    public static void main(String[] args) {
        System.out.println("2^10 = " + myPow(2.0, 10));
        System.out.println("2^9 = " + myPow(2.0, 9));
        System.out.println("2^-2 = " + myPow(2.0, -2));
        System.out.println("5^0 = " + myPow(5.0, 0));
        System.out.println("1.0000000000001^-2147483648 = " + myPow(1.0000000000001, -2147483648));
    }

    public static double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        return binaryPow(x, N);
    }
    
    private static double binaryPow(double x, long n) {
        if (n == 0) {
            return 1.0;
        }
        double half = binaryPow(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}