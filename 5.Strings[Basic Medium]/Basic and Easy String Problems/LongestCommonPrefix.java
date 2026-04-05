import java.util.*;
public class LongestCommonPrefix {
    public static void main(String[] args){
        String[] input = {"interview", "internet", "internal", "interval"};
        Arrays.sort(input);
        StringBuilder ans = new StringBuilder();
        String first = input[0];
        String last = input[input.length-1];
        for(int i=0;i<Math.min(first.length(),last.length());i++){
            if(first.charAt(i)!=last.charAt(i)){
                break;
            }
            ans.append(first.charAt(i));
        }
        System.out.println(ans.toString());
    }    
}
