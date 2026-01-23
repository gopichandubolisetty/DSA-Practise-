public class ReverseAnArray {
    public static void main(String[] args){
        int[] array = {1,9,6,7,6,2};
        int p1 = 0;
        int p2 = array.length-1;
        reverArray(array,p1,p2);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

        System.out.println();
        System.out.println("Using while loop ");
        int st=0;
        int en=array.length-1;
        while(st<en){
            int temp = array[en];
            array[en] = array[st];
            array[st] = temp;
            st++;en--;
        }
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

    }
// Using two pointer method using recurrsion
    public static int[] reverArray(int[] arr,int p1,int p2){
        if(p2<p1){
            return arr;
        }
        int temp = arr[p2];
        arr[p2] = arr[p1];
        arr[p1] = temp;
        return reverArray(arr,p1+1,p2-1);
    }
}
