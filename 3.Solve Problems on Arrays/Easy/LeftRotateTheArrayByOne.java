public class LeftRotateTheArrayByOne {
    public static void main(String[] args){
        int[] ar1 = {1,2,3,4,5};
        int temp=ar1[0];

        if(ar1.length<=1){
            return;
        }
        for(int i=0;i<ar1.length-1;i++){
            ar1[i]=ar1[i+1];
        }
        ar1[ar1.length-1]=temp;

        for(int i=0;i<ar1.length;i++){
            System.out.print(ar1[i]+" ");
        }
    }
}
