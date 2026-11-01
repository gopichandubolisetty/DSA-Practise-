import java.util.Scanner;

public class GraphColoring {
    static int v,m;
    static int[][] graph;
    static int[] color;

    public static void execute(Scanner sc ){
        System.out.println("Enter the number of vertices: ");
        v = sc.nextInt();
        System.out.println("Enter no of colors: ");
        m = sc.nextInt();
        System.out.println("Enter the adjacency matrix: ");
        graph = new int[v][v];
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                graph[i][j]=sc.nextInt();
            }
        }

        int[][] comp = new int[v][v];
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                if(i!=j && graph[i][j]!=1){
                    comp[i][j]=0;
                }else{
                    comp[i][j]=1;
                }
            }
        }

        if(solve(0,comp)){
            for(int i=0;i<v;i++){
                if(i>0){
                    System.out.print(" ");
                    System.out.print(color[i]);
                }
                System.out.println();
                System.out.println("Solution no");
            }
        }
    }

        public static boolean solve(int ver,int[][] co){
            if(ver==v){
                return true;
            }
            for(int c=1;c<=m;c++){
                if(isSafe(ver,c,co)){
                    color[ver]=c;
                    if(solve(ver+1,co)){
                        return true;
                    }
                    color[ver]=0;
                }
            }
            return false;
        }

        public static boolean isSafe(int v,int c,int[][] co){
            for(int i=0;i<v;i++){
                if(co[v][i]!=0 && color[i]==c){
                    return false;
                }
            }
            return true;
        }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GraphColoring.execute(sc);
        sc.close();
    }
}
