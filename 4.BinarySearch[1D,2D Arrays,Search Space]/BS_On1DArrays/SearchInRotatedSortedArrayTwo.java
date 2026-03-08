public class SearchInRotatedSortedArrayTwo {
    public static void main(String[] args) {
        int[] nums = {7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        int k = 3;
        int ans = -1;

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == k) {
                ans = mid;
                break;
            }

            if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
                left++;
                right--;
                continue;
            }

            if (nums[left] <= nums[mid]) {
                if (nums[left] <= k && k < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] < k && k <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        System.out.println(ans);
    }
}
