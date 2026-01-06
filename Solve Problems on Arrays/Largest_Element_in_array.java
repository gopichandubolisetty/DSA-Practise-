public class Largest_Element_in_array {
    public static void main(String[] args){
        int[] arr = {2,5,1,3,0};
        int max = arr[0];
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        System.out.println("The largest element is : "+max);
    }
}
