public class CheckPrimeOrNot {
    public static boolean isPrime(int num){
        if(num<=1) return false;

        return primeHelper(num,2);
    }

    public static boolean primeHelper(int n,int d){
        if(d>n/d){
            return true;
        }

        if(n%d==0){
            return false;
        }

        return primeHelper(n,d+1);
    }

    public static void main(String[] args){
        int num = 41;
        System.out.println(isPrime(num));
    }
}
