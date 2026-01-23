public class MergeTwoStrings {
    public static void main(String[] args){
        String s1 = "hello";
        String s2 = "geeks";
        String result = "";
        int len = (s1.length()>s2.length()) ? s1.length() : s2.length();
        int i=0;
        while(i>=0){
            if(s1.length()>i){
                result+=s1.charAt(i);
            }
            if(s2.length()>i){
                result+=s2.charAt(i);
            }
            
            if(i<=len-1){
                i++;
            }else{
                break;
            }
        }
        System.out.println(result);
    }
}
