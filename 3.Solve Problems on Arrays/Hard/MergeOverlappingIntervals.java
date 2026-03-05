import java.util.Arrays;

public class MergeOverlappingIntervals {
    public static void printArray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
            System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int[][] nums = {{1,3},{2,6},{8,10},{15,18}};
        int rowlen = nums.length;
        int collen = nums[0].length;
        int[][] order = new int[rowlen][collen];
        // System.out.println(rowlen+" "+collen);
        printArray(nums);
        Arrays.sort(nums, (a, b) -> Integer.compare(a[0], b[0]));
        printArray(nums);
        for(int i=0;i<rowlen;i++){
            for(int j=0;j<collen;j++){
                
            }
        }
    }
}
