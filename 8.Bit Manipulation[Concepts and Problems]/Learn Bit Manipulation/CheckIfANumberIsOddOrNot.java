public class CheckIfANumberIsOddOrNot {

    public static boolean isOdd(int n){
        return n%2==0;
    }
    public static void main(String[] args){
        int n = 70;
        if(!isOdd(n)){
            System.out.print("The given number is odd ");
        }else{
            System.out.print("The given number is not odd");
        }
    }
}
