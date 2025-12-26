import java.util.Arrays;

public class Sorted_Array {
    public static void main(String[] args){
        int[] n1 = {1,2,3,4,5,6};
        int[] temp = n1;
        Arrays.sort(n1);
        if(Arrays.equals(n1,temp)){
            System.out.println("Arrays are sorted");
        }
    }
}
