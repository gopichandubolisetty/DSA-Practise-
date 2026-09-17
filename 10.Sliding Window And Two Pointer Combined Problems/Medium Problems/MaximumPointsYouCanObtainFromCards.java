public class MaximumPointsYouCanObtainFromCards {
    public static int maxScore(int[] cardPoints, int k) {
        int lsum = 0;
        int rsum = 0;
        int index = cardPoints.length - 1;
        
        for (int i = 0; i <= k - 1; i++) {
            lsum += cardPoints[i];
        }
        
        int ms = lsum;
        
        for (int i = k - 1; i >= 0; i--) {
            lsum = lsum - cardPoints[i];
            rsum = rsum + cardPoints[index];
            index--;
            ms = Math.max(ms, lsum + rsum);
        }
        
        return ms;
    }

    public static void main(String[] args) {
        int[] cardPoints = {1, 2, 3, 4, 5, 6, 1};
        int k = 3;
        
        int result = maxScore(cardPoints, k);
        Sys
}
