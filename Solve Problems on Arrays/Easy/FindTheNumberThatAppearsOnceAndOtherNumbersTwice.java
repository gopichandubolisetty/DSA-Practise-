public class FindTheNumberThatAppearsOnceAndOtherNumbersTwice {

    public static void printArray(int[] n){
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
    }
   public static void main(String[] args){
    int[] arr = {4,1,2,1,2};
    int n = arr.length;
    int val=0;
    for(int i=0;i<n;i++){
        val=val^(arr[i]);
    }
    System.out.println("The number which is repeated is "+val);
}
}