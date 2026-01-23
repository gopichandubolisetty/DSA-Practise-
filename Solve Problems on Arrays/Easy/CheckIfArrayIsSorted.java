public class CheckIfArrayIsSorted {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
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
