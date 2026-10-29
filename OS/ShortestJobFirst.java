import java.util.Scanner;

public class ShortestJobFirst {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter no of process: ");
        int n = sc.nextInt();
        int[] pid = new int[n];
        int[] wt = new int[n];
        int[] bt = new int[n];
        int[] tat = new int[n];

        

        for(int i=0;i<n;i++){
            pid[i]=i+1;
            System.out.print("Enter the burst time of the process : "+(i+1)+":");
            bt[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(bt[i]>bt[j]){
                    int temp = bt[i];
                    bt[i]=bt[j];
                    bt[j]=temp;

                    temp = pid[i];
                    pid[i]=pid[j];
                    pid[j]=temp;

                }
            }
        }

        wt[0]=0;

        for(int i=1;i<n;i++){
            wt[i]=wt[i-1]+bt[i-1];
        }

        for(int i=0;i<n;i++){
            tat[i]=wt[i]+bt[i];
        }

        System.out.println("\nPID\tBRUST\tWAITITNG\tTurnAround");
        for(int i=0;i<n;i++){
            System.out.println(pid[i]+ " "+wt[i]+" "+tat[i]+" "+bt[i]);
        }

        System.out.println("chart");
        for(int i=0;i<n;i++){
            System.out.print("--------");
        }       
        System.out.println();

        System.out.print("| ");
        for(int i=0;i<n;i++){
            System.out.print(" P"+pid[i]+"  |");
        }
        System.out.println();

        for(int i=0;i<n;i++) System.out.print("--------");
        System.out.println();

        for(int i=0;i<n;i++){
            System.out.print(tat[i]);
        }
    }
}
