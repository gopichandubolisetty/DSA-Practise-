public class CheckIfANumberIsAPowerOfAnotherNumber {
    public static void main(String[] args){
        
        int n =10;
        int y=1;
        int k=0;
        boolean bo = true;
        while(bo){
            if(Math.pow(n,k) == y){
                System.out.println("The power of the given number is at : "+k);
                break;
            }
            k++;
        }
    }
}
