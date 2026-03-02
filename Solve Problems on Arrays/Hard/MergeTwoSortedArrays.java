public class MergeTwoSortedArrays {

    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] num1 = {-5,-2,4,5,0,0,0};
        int[] num2 = {-3,1,8};
        int len1 = num1.length;
        int len2 = num2.length;
        int p1 = len1-1;
        int p2 = len2-1;
        for(int i=len1-1;i>=0;i--){
            if(num1[i]!=0){
                p1=i;break;
            }
        }
        len1--;
        while(p1>=0 && p2>=0){
            if(num1[p1]<num2[p2]){
                num1[len1] = num2[p2];
                p2--;len1--;
            }else{
                num1[len1]=num1[p1];
                len1--;p1--;
            }
        }

        while(p2 >=0){
            num1[len1] = num2[p2];
            len1--;p2--;
        }

        printArray(num1);
    }
}
