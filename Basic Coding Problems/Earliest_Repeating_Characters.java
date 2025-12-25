public class Earliest_Repeating_Characters {
    public static void main(String[] args){
        String s1 = "hello geeks" ;
        int[] count = new int[26];
        for(int i=0;i<s1.length();i++){
            if(count[s1.charAt(i)-'a']>0){
                System.out.println(s1.charAt(i));
                break;
            }else{
                count[s1.charAt(i)-'a']++;
            }
        }
    }
}
