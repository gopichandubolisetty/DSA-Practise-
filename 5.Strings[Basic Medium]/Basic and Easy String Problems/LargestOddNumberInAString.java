public class LargestOddNumberInAString {
    public static void main(String[] args){
        String number = "5347";
        int size = number.length();
        for(int i = size-1;i>=0;i--){
            int digit = number.charAt(i)-'0';
            if(digit%2!=0){
                System.out.println(number.substring(0,i+1));
                break;
            }
        }
    }
}
