import java.util.Scanner;
public class FloydWarshall {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = sc.nextInt();
        int INF = 9999;
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    arr[i][j]=0;
                }else{
                    arr[i][j]=INF;
                }
            }
        }
        for(int i=0;i<f;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            arr[u-1][v-1]=w;
        }

        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(arr[i][k]!=INF && arr[k][j]!=INF){
                        arr[i][j]=Math.min(arr[i][j],arr[i][k]+arr[k][j]);
                    }
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==INF){
                    System.out.print("INF");
                }else{
                    System.out.print(arr[i][j]);
                }
                if(j<n-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
