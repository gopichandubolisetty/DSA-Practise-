import java.util.Scanner;
public class sum_of_digits_is_palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sd =0;
        while(n>0){
            sd+=n%10;
            n/=10;
        }
        int temp =sd;
        int rev=0;
        while(sd>0){
            rev = rev*10 +sd%10;
            sd/=10;
        }
        if(temp==rev){
            System.out.println("Given number sum of the number is a palindrome");
        }else{
            System.out.println("Given number sum of the number is a palindrome");
        }
        sc.close();
    }
}
