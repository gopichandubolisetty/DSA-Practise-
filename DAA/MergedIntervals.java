import java.util.Arrays;
import java.util.Scanner;
public class MergedIntervals {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<=1;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Merged Intervals");
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        int[][] arr1 = new int[n][2];
        arr1[0][0] = arr[0][0];
        arr1[0][1] = arr[0][1];
        int point =0;

        for(int i=0;i<n;i++){
            if(arr1[point][1]>=arr[i][0]){
                arr1[point][1]=Math.max(arr1[point][1],arr[i][1]); //MADE ERROR
            }else{
                point++;
                arr1[point][0] = arr[i][0]; //MADE ERROR PUT I
                arr1[point][1] = arr[i][1];
            }
        }
        
        for(int i=0;i<point;i++){
            System.out.println(arr1[i][0]+" "+arr1[i][1]);
        }
    }
}
