public class Palindrome_Array {
    public static void main(String[] args){
        int[] arr = {3,6,0,6,3};
        int[] out = new int [arr.length];
        for(int i=0;i<arr.length;i++){
            out[(arr.length)-i-1] = arr[i];
        }
        System.out.println(out==arr);
    }
}
