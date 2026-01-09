import java.util.Scanner;

public class linear_Search {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] array = {1,2,5,4,3,9,7,5,3,5};
        if(array.length<1){
            System.out.println("The array length should be greater than zero");
            return;
        }
        int n = sc.nextInt();
        int index=-1;
        for(int i=0;i<array.length;i++){
            if(array[i]==n){
                index=i;break;
            }
        }
        
        if(index!=-1){
            System.out.println("The given number is at index : "+index);
        }else{
            System.out.println(index);
        }
    }
}
