public class AllocateMinimumNumberOfPages {
    public static void main(String[] args) {
        int[] arr = {25, 46, 28, 49, 24};
        int n = 5;
        int m = 4;

        if (m > n) {
            System.out.println("The answer is: -1");
            return;
        }

        int max = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) max = arr[i];
            sum += arr[i];
        }

        int low = max;
        int high = sum;

        while (low <= high) {
            int mid = (low + high) / 2;
            
            int students = 1;
            long pagesStudent = 0;
            for (int i = 0; i < n; i++) {
                if (pagesStudent + arr[i] <= mid) {
                    pagesStudent += arr[i];
                } else {
                    students++;
                    pagesStudent = arr[i];
                }
            }

            if (students > m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("The answer is: " + low);
    }
}