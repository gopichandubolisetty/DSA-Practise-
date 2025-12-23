import java.util.Scanner;

public class Automorphic_Number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l =0;
        int temp = n;
        while(temp>0){
            l++;
            temp/=10;
        }


        int sq = n*n;
        int newn= sq % (int)Math.pow(10,l);
        
        if(newn == n){
            System.out.println("Given number is a Automotphic Number");
        }else{
            System.out.println("Given number is not a Automorphic Number");
        }
    }
}
