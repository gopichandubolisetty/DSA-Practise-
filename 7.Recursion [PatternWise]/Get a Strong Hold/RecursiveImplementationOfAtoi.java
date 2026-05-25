public class RecursiveImplementationOfAtoi {

    public static int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;
        int i = 0;
        int sign = 1;
        long result =0;
        if (s.charAt(i) == '-' || s.charAt(i) == '+') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        return result(result,s,i,sign);
    }

    public static int result(long result,String s,int i,int sign){
        if(i >=s.length() || !(Character.isDigit(s.charAt(i)))) {
            return (int) (sign*result);
        }
            result = result * 10 + (s.charAt(i) - '0');

            if (sign == 1 && result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign == -1 && -result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            return result(result,s,i+1,sign);
    }

    public static void main(String[] args){
         String s = "   -12345";
         System.out.println("The answer is : "+ myAtoi(s));
    }
}
