public class count_Maximum_Consecutive_Ones_In_The_Array {

    public static void printArray(int[] arr,int p1,int p2){
        for(int i=p1;i<p2;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] array = {1,1,0,1,1,1,1,1,1,1,1,1,1,0,0,1,0,1};
        int p1 =0;
        int p2=1;
        int max =0;
        int ind1 =0;
        int ind2=0;
        while(p2!=array.length-1){
            if(array[p1]==1 && array[p2]==1){
                if(p2!=array.length-1){
                    p2++;
                }                
            }else if(p1==p2){
                p2++;
            }else{
                p1++;
            }
            if(max<(p2-p1)){
                max=p2-p1;
                ind1=p1;
                ind2=p2;
            }
        }

        System.out.println(ind1);
        System.out.println(ind2);
        printArray(array,ind1,ind2);
        System.out.println("The number of consecutive ones is : "+(ind2-ind1));
    }
}
