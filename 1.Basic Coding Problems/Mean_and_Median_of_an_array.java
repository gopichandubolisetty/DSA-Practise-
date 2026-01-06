import java.util.Scanner;

public class Mean_and_Median_of_an_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum= 0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        System.out.println("Average of the arry is : "+sum/arr.length);
        if(arr.length%2==0){
            System.out.println("Meadin of the array is : "+(arr[arr.length/2]+arr[(arr.length/2)+1])/2);
        }else{
            System.out.println("Medain of the array is : "+arr[(arr.length/2)]);
        }
    }
}
