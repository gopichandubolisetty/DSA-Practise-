import java.util.Scanner;
public class checkthebinary{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean bo=true;
        if(n<0){
            bo=false;
        }
        else{
            while(n>0){
                int l=n%10;
                if(l>1){
                    bo=false;
                }
                n=n/10;
            }
        }
        if(bo){
            System.out.println("Given number is Boolean Number");
        }else{
            System.out.println("Given number is not a Boolean Number");
        }
        sc.close();
    }
}