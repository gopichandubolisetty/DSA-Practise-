import java.util.Scanner;

public class WorstFit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of memory blocks: ");
        int m = sc.nextInt();
        int[] mem = new int[m];
        System.out.println("Enter block sizes:");
        for(int i = 0; i < m; i++) {
            mem[i] = sc.nextInt();
        }

        System.out.print("Enter the number of processes: ");
        int n = sc.nextInt();
        int[] pro = new int[n];
        System.out.println("Enter process sizes:");
        for(int i = 0; i < n; i++) {
            pro[i] = sc.nextInt();
        }

        int[] allo = new int[n];
        for(int i = 0; i < n; i++) {
            allo[i] = -1;
            int worstIdx = -1;
            
            for(int j = 0; j < m; j++) {
                if(mem[j] >= pro[i]) {
                    if(worstIdx == -1 || mem[j] > mem[worstIdx]) {
                        worstIdx = j;
                    }
                }
            }

            if(worstIdx != -1) {
                allo[i] = worstIdx;
                mem[worstIdx] -= pro[i];
            }
        }

        System.out.println("\nProcess No.\tProcess Size\tBlock Allocated");
        for(int i = 0; i < n; i++) {
            System.out.print((i + 1) + "\t\t" + pro[i] + "\t\t");
            if(allo[i] != -1) {
                System.out.println((allo[i] + 1));
            } else {
                System.out.println("Not Allocated");
            }
        }
        sc.close();
    }
}