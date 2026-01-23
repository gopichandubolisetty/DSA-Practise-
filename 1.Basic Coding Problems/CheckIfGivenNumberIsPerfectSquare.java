public class CheckIfGivenNumberIsPerfectSquare {
    public static void main(String[] args){
        int n = 36;
        int val = (int)Math.floor(Math.sqrt(n));
        if(n==val*val){
            System.out.println("The given number is a perfect square");
        }else{
            System.out.println("The given number is not a perfect number");
        }
    }
}
