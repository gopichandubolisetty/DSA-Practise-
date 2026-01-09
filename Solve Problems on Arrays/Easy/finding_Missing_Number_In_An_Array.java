    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     boolean[] check = new boolean[n];
    //     int[] array = takeArray(n);
    //     for(int i=0;i<n;i++){
    //         if(array[i]!=n){
    //             check[array[i]] = true;
    //         }
    //     }

    //     for(int i=0;i<n-1;i++){
    //         if(check[i]!=true){
    //             System.out.println("In the given array, number "+i+"is missing. So,"+i+"is the answer");
    //         }
    //     }
    // }
import java.util.Scanner;
public class finding_Missing_Number_In_An_Array {
    public static int takeArray(int n){
        Scanner sc = new Scanner(System.in);
        int sum =0;
        for(int i=0;i<n;i++){
             System.out.println("Enter the element: ");
             sum+=sc.nextInt();
        }
        return sum;
    }  
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = takeArray(n-1);
        int total = n*(n+1)/2;
        System.out.println("The number which is not in the array is "+(total-sum));
        sc.close();
    }
}
