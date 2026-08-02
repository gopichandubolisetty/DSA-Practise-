public class CheckIfANumberIsPowerOfTwoOrNot {

    public static boolean IsPowerOfTwo(int n){
        return (n>0 && (n &(n-1))==0);
    }

    public static void main(String[] args){
        int n = 64;
        if(IsPowerOfTwo(n)){
            System.out.println("The given number is power of 2");
        }else{
            System.out.println("The given number is not a power of 2");
        }
    }
}
