import java.util.Scanner;
class Output {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        printNumber(sc);
}
public static void printNumber(Scanner sc) {
        int n = sc.nextInt();
        System.out.print(n);
    }
}