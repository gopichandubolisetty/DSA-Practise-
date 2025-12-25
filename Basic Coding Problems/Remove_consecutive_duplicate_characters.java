public class Remove_consecutive_duplicate_characters {
    public static void main(String[] args){
        String s = "aabccba";

        if(s.length()==1){
            System.out.println(s);
        }else{
            for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)!=s.charAt(i+1)){
                System.out.print(s.charAt(i)+" ");
            }if(i==s.length()-2){
                System.out.print(s.charAt(s.length()-1));
            }
        }
        }
        
    }
}
