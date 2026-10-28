import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class BackTrackingSubset {
    static int n,t;
    static int[] arr;
    static boolean found;

    public static void run(){
        Arrays.sort(arr);
        backTrack(0,0,new ArrayList<>());
        if(!found){
            System.out.println("No sub set found");
        }
    }
    public static void backTrack(int start,int csum,List<Integer> csubset){
        if(csum==t){
            found = true;
            for(int val : csubset){
                System.out.print(val+" ");
            }
            System.out.println();
            return;
        }
        for(int i=start;i<n;i++){
            if(i>start && arr[i]==arr[i-1]) continue;
            if(csum+arr[i]>t) break;
            csubset.add(arr[i]);
            backTrack(i+1,csum+arr[i],csubset);
            csubset.remove(csubset.size()-1);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        t = sc.nextInt();
        run();
    }
}
