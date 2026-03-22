public class KthElementOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {2, 3, 6, 7, 9};
        int[] nums2 = {1, 4, 8, 10};
        int k = 5;

        int i = 0;
        int j = 0;
        int count = 0;
        int result = -1;

        while (i < nums1.length && j < nums2.length) {
            int current;
            if (nums1[i] < nums2[j]) {
                current = nums1[i];
                i++;
            } else {
                current = nums2[j];
                j++;
            }
            count++;
            if (count == k) {
                result = current;
                break;
            }
        }

        if (count < k) {
            while (i < nums1.length) {
                count++;
                if (count == k) {
                    result = nums1[i];
                    break;
                }
                i++;
            }
        }

        if (count < k) {
            while (j < nums2.length) {
                count++;
                if (count == k) {
                    result = nums2[j];
                    break;
                }
                j++;
            }
        }

        System.out.println(result);
    }
}
