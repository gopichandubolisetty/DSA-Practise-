import java.util.Scanner;

public class FindNumberOfDiagonals {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The number of diagonals are : "+(n*(n-3)/2));
    }
}
