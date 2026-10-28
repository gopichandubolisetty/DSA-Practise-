import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class KuhnsAlgorithm {

    public static boolean dfs(int u, List<int[]> adj, boolean[] visited, int[] match) {
        for (int v : adj.get(u)) {
            if (!visited[v]) {
                visited[v] = true;
                if (match[v] < 0 || dfs(match[v], adj, visited, match)) {
                    match[v] = u;
                    return true;
                }
            }
        }
        return false;
    }

    public static int anCM(int nl, int nr, List<int[]> adj) {
        int result = 0;
        int[] match = new int[nr];
        Arrays.fill(match, -1);
        
        for (int i = 0; i < nl; i++) {
            boolean[] visited = new boolean[nr];
            if (dfs(i, adj, visited, match)) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nl = sc.nextInt();
        int nr = sc.nextInt();
        
        List<int[]> adj = new ArrayList<>();
        for (int i = 0; i < nl; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < nr; j++) {
                int val = sc.nextInt();
                if (val == 1) {
                    row.add(j);
                }
            }
            int[] arr = new int[row.size()];
            for (int k = 0; k < row.size(); k++) {
                arr[k] = row.get(k);
            }
            adj.add(arr);
        }
        sc.close();

        int maxMatching = anCM(nl, nr, adj);
        System.out.println("Maximum Matching: " + maxMatching);
    }
}