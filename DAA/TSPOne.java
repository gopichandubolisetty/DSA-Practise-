import java.util.Arrays;
import java.util.Scanner;
public class TSPOne {
    static int n;
    static int[][] dp,parent,dist;
    public static int tsp(int m,int p){
        if(m==(1<<n)-1){
            return dist[p][0];
        }
        if(dp[m][p]!=-1){
            return dp[m][p];
        }
        int a = 99999999,b=-1;
        for(int i=0;i<n;i++){
            if((m&(1<<i))==0){
                int c = dist[p][i] + tsp(m|(1<<i),p);
                if(c<a){
                    a=c;
                    b=i;
                }
            }
        }
            parent[m][p] = b;
            return dp[m][p]=a;
        
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        dist = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dist[i][j]=sc.nextInt();
            }
        }

        dp = new int[1<<n][n];
        parent = new int[1<<n][n];
        for(int[] row : dp ) Arrays.fill(row,-1);
        for(int[] row : parent) Arrays.fill(row,-1);

        int cost = tsp(1,0);
        int[] path = new int[n+1];
        int pos=0,mask=1;
        path[0]=0;
        for(int i=1;i<n;i++){
           int next = parent[mask][pos];
           path[i]=next;
           mask|=(1<<next);
           pos= next;
        }
        path[n]=0;

        StringBuilder sb = new StringBuilder();

        sb.append("Optimal Delivery : ");
        for(int i=0;i<=n;i++){
            sb.append(path[i]+1);
            if(i!=n) sb.append("--");
        }

        System.out.println(sb.toString());
        System.out.println(cost);

    }
}
