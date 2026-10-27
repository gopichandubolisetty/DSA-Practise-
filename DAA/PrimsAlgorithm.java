import java.util.Arrays;
import java.util.Scanner;
public class PrimsAlgorithm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int[][] graph = new int[v][v];
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                graph[i][j]=sc.nextInt();
            }
        }
        int k = sc.nextInt();
        int[] parent = new int[v];
        int[] key = new int[v];
        boolean[] visi = new boolean[v];
        Arrays.fill(key,Integer.MAX_VALUE);
        key[0]=0;
        parent[0]=-1;
        for(int count =0;count<v-1;count++){
            int u=-1;
            int min = Integer.MAX_VALUE;
            for(int i=0;i<v;i++){
                if(!visi[i] && key[i]<min ){
                    u=i;
                    min=key[i];
                }
            }
            if(u==-1){
                System.out.println("MST cannot be formed");
                return;
            }
            visi[u]=true;
            for(int i=0;i<v;i++){
                if(graph[u][i]!=0 && !visi[i] && graph[u][i]<key[i]){
                    parent[i]=u;
                    key[i]=graph[u][i];
                }
            }
        }

        System.out.println("Edge weigh");
        int total=0;
        for(int i=1;i<v;i++){
            if(parent[i]==-1){
                System.out.println("MST cannot be formed");
            }
            int a = Math.min(parent[i],i);
            int b = Math.max(parent[i],i);
            System.out.println(a+" "+b+" "+graph[parent[i]][i]);
            total+=graph[parent[i]][i];
        }
        System.out.println(total);
    }
}
