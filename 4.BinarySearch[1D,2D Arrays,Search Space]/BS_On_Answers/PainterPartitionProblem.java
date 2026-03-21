public class PainterPartitionProblem {
    public static void main(String[] args) {
        int[] boards = {10, 20, 30, 40};
        int k = 2;

        int low = 0;
        int high = 0;
        for (int board : boards) {
            low = Math.max(low, board);
            high += board;
        }

        int result = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            int painters = 1;
            int currentBoardSum = 0;
            for (int board : boards) {
                if (currentBoardSum + board <= mid) {
                    currentBoardSum += board;
                } else {
                    painters++;
                    currentBoardSum = board;
                }
            }

            if (painters <= k) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println("The answer is: " + result);
    }
}