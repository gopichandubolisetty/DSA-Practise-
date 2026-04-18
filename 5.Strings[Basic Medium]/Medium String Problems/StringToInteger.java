public class StringToInteger {
    public static void main(String[] args) {
        String str = "42";
        str.trim();
        int sign = 1;
        int i =0;

        if(str.charAt(i)=='-' || str.charAt(i)=='+'){
             sign = (str.charAt(i) == '-') ? -1 : 1;
             i++;
        }



        int result =0;
        while(i<str.length() && Character.isDigit(str.charAt(i))){
            result = result *10 + (str.charAt(i)-'0');
            if(sign ==1 && result>Integer.MAX_VALUE){
                System.out.println(Integer.MAX_VALUE);
                return;
            }
            if(sign == -1 && result<Integer.MIN_VALUE){
                System.out.println(Integer.MIN_VALUE);
                return;
            }
            i++;
        }
        System.out.println(result);
    }
}