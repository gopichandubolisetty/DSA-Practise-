import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l=0;
        int temp = n;
        int temp2=n;
        int d=0;
        int sum=0;
        while(temp>0){
            l++;
            temp/=10;
        }
        while(n>0){
            d=n%10;
            sum=sum+(int)Math.pow(d,l);
            n=n/10;
        }
        if(sum==temp2){
            System.out.println("Given number is palindrome");
        }else{
            System.out.println("Given number is not a palindrome");
        }
}    }

