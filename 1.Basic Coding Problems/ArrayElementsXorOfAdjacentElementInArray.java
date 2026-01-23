public class ArrayElementsXorOfAdjacentElementInArray {
    public static void main(String[] args){
        int[] arr = {10,11,1,2,3};
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                System.out.print(arr[i]);
                break;
            }
            System.out.print((arr[i]^arr[i+1])+" ");
        }
    }
}
