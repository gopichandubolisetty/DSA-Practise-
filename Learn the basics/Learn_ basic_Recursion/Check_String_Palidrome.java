public class Check_String_Palidrome {
    public static void main(String[] args){
        String str = "ABnCCBA";
        int st=0;
        int en=str.length()-1;
        boolean bo = true;
        while(st<en){
            if(str.charAt(st) == str.charAt(en)){
                st++;
                en--;
            }else{
                bo =false;
               break;
            }
        }
        if(bo){
            System.out.println("Given string is palindrome");
        }else{
            System.out.println("Given string is not a palindrome");
        }

    }
}
