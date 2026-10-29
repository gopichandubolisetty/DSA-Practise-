import java.util.Scanner;

public class BankersAlgorithm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] alloc = new int[r][c];
        int[][] max = new int [r][c];
        
        System.out.println("Give allocation matrix: ");

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                alloc[i][j] = sc.nextInt();
            }
        }

        System.out.println("Give max matrix : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                max[i][j]=sc.nextInt();
            }
        }

        int[][] need = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                need[i][j]=max[i][j]-alloc[i][j];
            }
        }

        int[] av = new int[c];
        for(int i=0;i<c;i++){
            av[i] = sc.nextInt();
        }


        int count=0;
        boolean[] finish = new boolean[r];
        int[] ss = new int[r];

        while(count<r){
            boolean found = false;
            for(int i=0;i<r;i++){
                if(!finish[i]){
                    boolean canrun = true;
                    for(int j=0;j<c;j++){
                        if(need[i][j]>av[j]){
                            canrun = false;
                            break;
                        }
                    }

                    if(canrun){
                        for(int j=0;j<c;j++){
                            av[j]+=alloc[i][j];
                        }
                        ss[count++] = i;
                        finish[i]=true;
                        found = true;
                    }
                }
            }

            if(!found){
                System.out.println("Not safe");
                return;
            }
        }

        System.out.println("\nSystem is in a SAFE state!");
        System.out.print("Safe Sequence: ");
        for(int i = 0; i < r; i++){
            System.out.print("P" + ss[i] + (i == r - 1 ? "" : " -> "));
        }
        System.out.println();
        sc.close();

    }
}
