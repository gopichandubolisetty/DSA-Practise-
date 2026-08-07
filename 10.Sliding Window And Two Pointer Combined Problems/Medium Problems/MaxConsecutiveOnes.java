public class MaxConsecutiveOnes {

    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int n = nums.length;
        int ch = 0;
        int len = 0;

        while (right < n) {
            if (nums[right] == 0 && ch < k) {
                ch++;
                right++;
            } else if (nums[right] == 1 && ch <= k) {
                right++;
            } else if (nums[right] == 0 && ch == k) {
                if (nums[left] == 0) {
                    ch--;
                    left++;
                } else {
                    left++;
                }
            }

            len = Math.max(len, right - left);
        }

        return len;
    }

    public static void main(String[] args) {
        MaxConsecutiveOnes solution = new MaxConsecutiveOnes();

        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;

        int result = solution.longestOnes(nums, k);
        System.out.println("Maximum consecutive ones with at most " + k + " flips: " + result);
    }
}


// public int longestOnes(int[] nums, int k) {
//         int left = 0, right = 0;
//         for (right = 0; right < nums.length; right++) {
//             if (nums[right] == 0) k--;
//             if (k < 0) {
//                 if (nums[left] == 0) k++;
//                 left++;
//             }
//         }
//         return right - left;
//     }