import java.util.Scanner;

public class ShortestJobFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of processes: ");
        int n = scanner.nextInt();
        
        int[] pid = new int[n];
        int[] arrivalTime = new int[n];
        int[] burstTime = new int[n];
        int[] completionTime = new int[n];
        int[] turnAroundTime = new int[n];
        int[] waitingTime = new int[n];
        boolean[] isCompleted = new boolean[n];

        for (int i = 0; i < n; i++) {
            pid[i] = i + 1;
            System.out.print("Enter arrival time for process " + pid[i] + ": ");
            arrivalTime[i] = scanner.nextInt();
            System.out.print("Enter burst time for process " + pid[i] + ": ");
            burstTime[i] = scanner.nextInt();
        }

        int currentTime = 0;
        int completed = 0;
        float totalWaitingTime = 0;
        float totalTurnAroundTime = 0;

        while (completed < n) {
            int idx = -1;
            int minBurstTime = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                if (arrivalTime[i] <= currentTime && !isCompleted[i]) {
                    if (burstTime[i] < minBurstTime) {
                        minBurstTime = burstTime[i];
                        idx = i;
                    }
                    if (burstTime[i] == minBurstTime) {
                        if (arrivalTime[i] < arrivalTime[idx]) {
                            idx = i;
                        }
                    }
                }
            }

            if (idx != -1) {
                completionTime[idx] = currentTime + burstTime[idx];
                turnAroundTime[idx] = completionTime[idx] - arrivalTime[idx];
                waitingTime[idx] = turnAroundTime[idx] - burstTime[idx];

                totalWaitingTime += waitingTime[idx];
                totalTurnAroundTime += turnAroundTime[idx];

                isCompleted[idx] = true;
                completed++;
                currentTime = completionTime[idx];
            } else {
                currentTime++;
            }
        }

        System.out.println("\nPID\tArrival\tBurst\tCompletion\tTurnaround\tWaiting");
        for (int i = 0; i < n; i++) {
            System.out.println(pid[i] + "\t" + arrivalTime[i] + "\t" + burstTime[i] + "\t" 
                               + completionTime[i] + "\t\t" + turnAroundTime[i] + "\t\t" + waitingTime[i]);
        }

        System.out.printf("\nAverage Waiting Time: %.2f", (totalWaitingTime / n));
        System.out.printf("\nAverage Turnaround Time: %.2f\n", (totalTurnAroundTime / n));

        scanner.close();
    }
}