import java.util.Scanner;
public class greatest_of_three_elements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int greatest = (a>b) ? ((a>c) ? a : c) : ((b>c) ? b :c );
        System.out.println(greatest);
    }
}
