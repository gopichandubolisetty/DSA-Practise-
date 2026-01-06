import java.util.Scanner;
public class oddoreven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("Given number is even");
        }else{
            System.out.println("Given number is an odd");
        }
        sc.close();
    }
}
