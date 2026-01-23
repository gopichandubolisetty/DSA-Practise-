import java.util.Scanner;

public class DiamondShape {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i>0;i--){
            for(int j=i ; j>1 ; j--){
                System.out.print(" ");
            }
            for(int k=0;k<(n-i+1);k++){
                System.out.print("* ");
            }  
            System.out.println();
    }

    for(int i=0;i<n;i++){
        for(int j=0;j<i;j++){
            System.out.print(" ");
        }
        for(int k=(n-i);k>0;k--){
            System.out.print("* ");
        }
        System.out.println();
    }
    sc.close();
}
}
