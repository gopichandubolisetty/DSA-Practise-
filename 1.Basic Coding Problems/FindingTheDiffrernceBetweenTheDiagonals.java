import java.util.Scanner;

public class FindingTheDiffrernceBetweenTheDiagonals {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] m1 = new int[4][4];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                m1[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        int primd=0;
        int secd=0;
        for(int i=0;i<4;i++){
            primd+=m1[i][i];
            secd+=m1[i][3-i];
        }
        System.out.println("The difference between the primaray and secondary is : "+(primd-secd));
    }
}
