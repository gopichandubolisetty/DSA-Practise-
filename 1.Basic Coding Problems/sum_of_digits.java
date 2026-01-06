import java.util.Scanner;
public class sum_of_digits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int sum=0;int l=0;
        while(n>0){
            l= n%10;
            sum+=l;
            n=n/10;
        }
        System.out.println("Sum of the digits the given number is : "+sum);
        sc.close();
    }
    
}