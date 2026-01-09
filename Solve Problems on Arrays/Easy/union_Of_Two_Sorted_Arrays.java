import java.util.*;

public class union_Of_Two_Sorted_Arrays {

    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] n1 = {1,2,3,4,5,6};
        int[] n2 = {5,4,6,3,8,7,9};
        Arrays.sort(n1);
        Arrays.sort(n2);
        int len = n1.length+n2.length;
        int[] arr = new int[len];
        int l=0;
        printArray(n1);printArray(n2);

        int i=0;
        int j=0;
        
        while(i!=n1.length && j!=n2.length){
            if(n1[i]<n2[j]){
                arr[l]=n1[i];
                l++;
                i++;
                j=0;
            }
        }

        printArray(arr);
    }
    
}
