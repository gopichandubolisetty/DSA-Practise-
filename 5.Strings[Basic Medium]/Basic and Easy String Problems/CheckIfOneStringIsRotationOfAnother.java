public class CheckIfOneStringIsRotationOfAnother {
    public static void main(String[] args){
        String s1 = "rotation";
        String s2 = "tionrota";
        if(s1.length()!=s2.length()){
            System.out.println("The both strings are not same length");
            return;
        }
        String compare = s1+s1;
        if(compare.contains(s2)){
            System.out.println("The given string is rotation of other");
        }else{
            System.out.println("The given string is not rotation of other");
        }
    }
}
