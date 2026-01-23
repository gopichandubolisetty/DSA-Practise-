public class AlternateElementsOfAnArray {
    public static void main(String[] args){
        int[] arr = {5,4,5,5,7,9,3,7,5,2,8};
        for(int i=0;i<arr.length;i+=2){
            System.out.print(arr[i]+" ");
        }
    }
}
