import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class KrushkalsAlgorithm {
    static int[] p,r;
    public static int find(int x){
        return p[x]==x ? x : (p[x]=find(p[x]));
    }
    public static boolean union(int a,int b){
        a=find(a);b=find(b);
        if(a==b){
            return false;
        }else if(r[a]>r[b]){
            p[b]=a;
        }else if(r[a]<r[b]){
            p[a]=b;
        }else{
            p[b]=a;
            r[a]++;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt(); int E = sc.nextInt();
        int[][] e = new int[E][3];
        for(int i=0;i<E;i++){
            e[i][0]=sc.nextInt();
            e[i][1] =sc.nextInt();
            e[i][2]=sc.nextInt();
        }
        int L =sc.nextInt() ; 
        Arrays.sort(e,(a,b)->a[2]-b[2]);
        List<int[]> mst = new ArrayList<>();
        p = new int[V]; r = new int[V];
        for(int i=0;i<V;i++) p[i]=i;
        int cost =0;
        for(int[] edge:e){
            if(edge[2]<=L && union(edge[0],edge[1])){
                mst.add(edge);
                cost+=edge[2];
            }
        }

        if(mst.size()==V-1){
            System.out.println("Selected Roads");
            for(int[] x:mst) System.out.println(x[0]+" - "+x[1]+" : "+x[2]);
            System.out.println("\nMinimum Construtcion cost = "+cost);
        }else{
            System.out.println("No feasible network");
        }
    }
}
