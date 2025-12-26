public class GCD_of_two_numbers {
    public static void main(String[] args){
        int n1 = 36;
        int n2 = 60;
        int gcd = 1;
        int bi = (n1<n2) ? n2 : n1;
        for(int i=1;i<=bi;i++){
            if(n2%i==0){
                if(n1%i==0){
                    if(i>gcd){
                        gcd = i;
                    }
                }
            }
        }
        System.out.println(gcd);
    }
}
