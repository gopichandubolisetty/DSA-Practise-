public class Check_Palindrome {
    public static void main(String[] args){
        int n = 354453;
        int temp =n;
        int rev = 0;
        while(n>0){
            rev = rev*10+n%10;
            n/=10;
        }
        if(rev==temp){
            System.out.println("The given number is palindrome");
        }else{
            System.out.println("Given number is not a palindrome");
        }
    }
}
