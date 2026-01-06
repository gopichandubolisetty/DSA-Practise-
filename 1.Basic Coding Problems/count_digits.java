import java.util.Scanner;
public class count_digits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int length=0;
        while(n>0){
            n=n/10;
            length++;
        }
        System.out.println(length);
    }
}
