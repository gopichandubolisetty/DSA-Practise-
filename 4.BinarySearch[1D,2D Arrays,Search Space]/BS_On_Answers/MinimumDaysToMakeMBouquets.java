
public class MinimumDaysToMakeMBouquets {
    public static void main(String[] args) {
        int[] bloomDays = {7, 7, 7, 7, 13, 11, 12, 7};
        int k = 3;
        int m = 2;

        if ((long) m * k > bloomDays.length) {
            System.out.println("We cannot make m bouquets.");
            return;
        }

        int min = bloomDays[0];
        int max = bloomDays[0];
        for (int day : bloomDays) {
            if (day < min) min = day;
            if (day > max) max = day;
        }

        int result = -1;
        for (int day = min; day <= max; day++) {
            int count = 0;
            int bouquets = 0;
            for (int bloom : bloomDays) {
                if (bloom <= day) {
                    count++;
                    if (count == k) {
                        bouquets++;
                        count = 0;
                    }
                } else {
                    count = 0;
                }
            }

            if (bouquets >= m) {
                result = day;
                break;
            }
        }

        if (result == -1) {
            System.out.println("We cannot make m bouquets.");
        } else {
            System.out.println("We can make bouquets on day " + result);
        }
    }
}