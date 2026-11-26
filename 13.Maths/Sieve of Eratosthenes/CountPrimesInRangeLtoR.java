import java.util.*;

public class CountPrimesInRangeLtoR {
    public static int countPrimes(long L, long R) {
        if (R < 2 || L > R) return 0;
        if (L < 2) L = 2;

        int limit = (int) Math.sqrt(R);
        boolean[] isPrimeSmall = new boolean[limit + 1];
        Arrays.fill(isPrimeSmall, true);
        isPrimeSmall[0] = false;
        if (limit >= 1) isPrimeSmall[1] = false;

        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= limit; i++) {
            if (isPrimeSmall[i]) {
                primes.add(i);
                for (long j = (long) i * i; j <= limit; j += i) {
                    isPrimeSmall[(int) j] = false;
                }
            }
        }

        int rangeSize = (int) (R - L + 1);
        boolean[] isPrimeRange = new boolean[rangeSize];
        Arrays.fill(isPrimeRange, true);

        for (int p : primes) {
            long start = Math.max((long) p * p, ((L + p - 1) / p) * p);
            for (long j = start; j <= R; j += p) {
                isPrimeRange[(int) (j - L)] = false;
            }
        }

        int count = 0;
        for (boolean isPrime : isPrimeRange) {
            if (isPrime) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        long L = 10;
        long R = 50;
        System.out.println(countPrimes(L, R));
    }
}