public class Number_of_divisors {
    public static void main(String[] args){
        int n = 64;
        int num =0;
        for(int i=1;i<n ;i++){
            if(n%i==0){
                System.out.print(i+" ");
                num++;
            }
        }
         System.out.println("The number of divisors are : "+num);
    }
}
