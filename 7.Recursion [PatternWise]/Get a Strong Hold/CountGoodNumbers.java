public class CountGoodNumbers {
    
    private static final int MOD = 1_000_000_007;

    public static int countGoodNumbers(long n) {
        long evenPositions = (n + 1) / 2;
        long oddPositions = n / 2;

        long totalEvenChoices = power(5, evenPositions);
        long totalOddChoices = power(4, oddPositions);

        return (int) ((totalEvenChoices * totalOddChoices) % MOD);
    }

    private static long power(long base, long exp) {
        long res = 1;
        base = base % MOD;
        
        while (exp > 0) {
            if (exp % 2 == 1) {
                res = (res * base) % MOD;
            }
            base = (base * base) % MOD;
            exp /= 2;
        }
        return res;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(countGoodNumbers(n));
        sc.close();
    }
}