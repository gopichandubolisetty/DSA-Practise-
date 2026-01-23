import java.util.Arrays;
public class PairWithMaximumProductInArrayOfIntegers {
    public static void main(String[] args){

        int[] arr = {1, 4, 3, 6, 7, 0};
        Arrays.sort(arr);

        System.out.println("The largest multiplication value is : " +(arr[arr.length-2]*arr[arr.length-1]) + "the numbers are : " + arr[arr.length-2] + " & " + arr[arr.length-1]);
}
}
