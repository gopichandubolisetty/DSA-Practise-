public class CountOccurrencesInSortedArray{
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 8, 8, 11, 13};
        int n = 8, x = 8;

        int first = -1;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                first = mid;
                high = mid - 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (first == -1) {
            System.out.println("The number of occurrences is: 0");
            return;
        }

        int last = -1;
        low = 0; 
        high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                last = mid;
                low = mid + 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        int ans = last - first + 1;
        System.out.println("The number of occurrences is: " + ans);
    }
}