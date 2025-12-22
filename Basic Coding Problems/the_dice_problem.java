import java.util.Scanner;

public class the_dice_problem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans=0;
        switch(n){
            case 1:
            ans=6;
            break;

            case 2:
            ans = 5;
            break;

            case 3:
            ans=4;
            break;

            case 4:
            ans=3;
            break;

            case 5:
            ans = 2;
            break;

            case 6:
            ans = 1;
            break;
        }
        System.out.println("The opposite number is : "+ans);
        sc.close();
    }
}
