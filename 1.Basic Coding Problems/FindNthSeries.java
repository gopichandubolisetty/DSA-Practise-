import java.util.Scanner;

public class FindNthSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int initial =0;
        int value = 0;
        for(int i=1;i<=n;i++){
            initial+=i;
            if(i==n){
                value = initial;
            }
        }
        System.out.println("The nth value of the series is : "+value);
        sc.close();
    }
}
