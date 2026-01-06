public class check_If_Array_Is_Sorted {
    public static void main(String[] args){
        int[] arr = {5,3,7,2,4,6,3,4,2};
        boolean check = true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                check =false;
            }
        }

        if(check) {
            System.out.println("The given array is sorted");
        }else{
            System.out.println("The given array is not sorted");
        }
    }
}
