public class Prime_number_check {
    public static void main(String[] args){
        int n = 56;
        int div=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                div++;
            }
        }
        if(div==2){
            System.out.println("Given number is a prime number");
        }else{
            System.out.println("Given number is not a prime number");
        }
    }
}
