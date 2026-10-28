import java.util.Scanner;

public class BestFit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of memory blocks: ");
        int m = sc.nextInt();
        int[] mem = new int[m];
        for(int i=0;i<m;i++){
            mem[i]=sc.nextInt();
        }

        System.out.print("Enter the number of process: ");
        int n = sc.nextInt();
        int[] pro = new int[n];
        for(int i=0;i<n;i++){
            pro[i]=sc.nextInt();
        }

        int[] allo = new int[n];
        for(int i=0;i<n;i++){
            int bestIdx = -1;
            for(int j=0;j<m;j++){
                if(mem[j]>pro[i]){
                    if(bestIdx==-1 || mem[j]<mem[bestIdx]){
                        bestIdx = j;
                    }
                }
            }

            if(bestIdx!=-1){
                allo[i]=bestIdx;
                mem[bestIdx]-=pro[i];
            }
        }

        for(int i=0;i<allo.length;i++){
            System.out.println(allo[i]);
        }

    }
}
