public class Sum_of_first_n {
    public static void main(String[] args){
        int n =3;
        System.out.println("Sum of the first n natural numbers is : "+sun(3));
        // Optimal approach is using formula

        System.out.println("Sum of n natural number is : "+(n*(n+1))/2);
    }

    public static int sun(int n){
        if(n==0){
            return 0;
        }
        return n+sun(n-1);
    }
}
