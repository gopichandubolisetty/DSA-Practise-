public class AllFactorialNumbersLessThanOrEqualToN {
    public static void main(String[] args){
        int n = 1500;
        int fact =1;
        int i=1;
        while(fact<n){
            fact*=i;
            if(fact<n){
                System.out.println(fact);
            }
            i++;
        }
    }
}
