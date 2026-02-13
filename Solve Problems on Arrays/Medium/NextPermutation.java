public class NextPermutation {

    public static int CalculateFact(int n){
        if(n<=0){
            return 1;
        }
        return n*CalculateFact(n-1);
    }
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] arr = {1,3,2};
        int n = arr.length;
        int fact = CalculateFact(n);
        int[] prem = new int[fact];
        
    }
}
