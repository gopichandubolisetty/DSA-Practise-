public class CountDigits {
    public static void main(String[] args){
        int n = 35413655;
        if(n==0){
            System.out.println(1);
        }
        int count = (int)(Math.log10(n)+1);
        System.out.println(count);
    }
}
