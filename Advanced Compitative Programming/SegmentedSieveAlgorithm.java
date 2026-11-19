import java.util.Arrays;
import java.util.Scanner;

public class SegmentedSieveAlgorithm {

    public static void segmentedSieve(long L, long R) {
        if (R < 2) {
            return;
        }
        if (L < 2) {
            L = 2;
        }

        int n = (int) Math.sqrt(R);
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int size = (int) (R - L + 1);
        boolean[] prime = new boolean[size];
        Arrays.fill(prime, true);

        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                long start = Math.max((long) i * i, ((L + i - 1) / i) * i);
                for (long j = start; j <= R; j += i) {
                    prime[(int) (j - L)] = false;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (prime[i]) {
                sb.append(i + L).append(" ");
            }
        }
        System.out.println(sb.toString().trim());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long L = sc.nextLong();
        long R = sc.nextLong();
        segmentedSieve(L, R);
        sc.close();
    }
}