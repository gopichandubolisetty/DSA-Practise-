public class All_factorial_numbers_less_than_or_equal_to_n {
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
