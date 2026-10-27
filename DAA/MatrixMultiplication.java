import java.util.Scanner;

public class MatrixMultiplication {

    public static String getOP(int i,int j,int[][] split){
        if(i==j){
            return "M"+i;
        }
        int k = split[i][j];
        String left = getOP(i,k,split);
        String right = getOP(k+1,j,split);
        return "("+left+right+")";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int nM = n-1;
        int[][] split = new int[nM+1][n];
        int[][] dp = new int[nM+1][n];
        for(int len =2;len<=nM;len++){
            for(int i=1;i<=nM-len+1;i++){
                int j = i+len-1;
                dp[i][j] = Integer.MAX_VALUE;
                for(int k=i;k<j;k++){
                    int cost = dp[i][k]+dp[k+1][j]+(arr[i-1]*arr[k]*arr[j]);
                    if(cost<dp[i][j]){
                        dp[i][j] = cost;
                        split[i][j]=k;
                    }
                }
            }
        }
        System.out.println(dp[1][nM]);
        System.out.println(getOP(1,nM,split));
    }
}
