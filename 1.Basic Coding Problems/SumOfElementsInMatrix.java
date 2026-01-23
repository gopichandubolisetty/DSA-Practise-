import java.util.Scanner;
public class SumOfElementsInMatrix {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = sc.nextInt();
                sum+=mat[i][j];
            }
            System.out.println();
        }
        System.out.println("Sum of the elements in the matrix is : "+sum );
        sc.close();
    }
}
