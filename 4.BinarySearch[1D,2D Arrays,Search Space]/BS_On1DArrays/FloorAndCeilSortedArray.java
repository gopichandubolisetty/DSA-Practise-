public class FloorAndCeilSortedArray {
    public static void main(String[] args) {
        int[] nums = {3, 4, 4, 7, 8, 10};
        int target = 5;
        
        int low = 0, high = nums.length - 1;
        int floor = -1;

  
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] <= target) {
                floor = nums[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

    
        low = 0; 
        high = nums.length - 1;
        int ceil = -1;


        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] >= target) {
                ceil = nums[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println("Floor: " + floor + " | Ceil: " + ceil);
    }
}