import java.util.Scanner;

public class sum_of_arthametic_series {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int value =1;
        int sum =1;
        for(int i=1;i<n;i++){
            System.out.print(i+" ");
            value = value+d;
            sum +=value;
            System.out.println(sum);
        }
        System.out.println("The total sum is : "+sum);
    }
}
