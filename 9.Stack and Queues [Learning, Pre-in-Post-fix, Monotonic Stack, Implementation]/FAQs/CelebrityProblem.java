import java.util.Scanner;
import java.util.Stack;

public class CelebrityProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            stack.push(i);
        }
        
        while (stack.size() > 1) {
            int a = stack.pop();
            int b = stack.pop();
            
            if (mat[a][b] == 1) {
                stack.push(b);
            } else {
                stack.push(a);
            }
        }
        
        int candidate = stack.pop();
        
        
        for (int i = 0; i < n; i++) {
            if (i == candidate) continue;
            if (mat[candidate][i] == 1 || mat[i][candidate] == 0) {
                System.out.println(-1);
                return;
            }
        }
        
        System.out.println(candidate);
    }
}


        /* 
        
        int left = 0;
        int right = n - 1;
        
        while (left < right) {
            if (mat[left][right] == 1) {
                left++;
            } else {
                right--;
            }
        }
        
        int candidateTwoPointer = left;
        
        // Verification step
        for (int i = 0; i < n; i++) {
            if (i == candidateTwoPointer) continue;
            if (mat[candidateTwoPointer][i] == 1 || mat[i][candidateTwoPointer] == 0) {
                System.out.println(-1);
                return;
            }
        }
        
        System.out.println(candidateTwoPointer);
        */