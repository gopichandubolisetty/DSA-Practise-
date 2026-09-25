import java.util.HashMap;
import java.util.Map;
public class LongestSubstringWithAtMostKDistinceCharacters {
    public int longestSubstringAtMostKDistinct(String s, int k) {
        int n = s.length();
        int ans = 0;

        Map<Character,Integer> fre = new HashMap<>();
        int left=0;

        for(int right=0;right<n;right++){
            char c = s.charAt(right);

            fre.put(c,fre.getOrDefault(c,0)+1);

            while(fre.size()>k){
                char ch = s.charAt(left);
                fre.put(ch,fre.get(ch)-1);
                left++;
                if(fre.get(ch)==0){
                    fre.remove(ch);
                }
            }

            ans = Math.max(ans,right-left+1);
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "ecebbbbbldffgjoipfjlsajfdljsdlfjfjjflkdsjfljasdlfjjfjfjfjfjfjfjfjfjfjfjfjfba";
        int k = 2;

        LongestSubstringWithAtMostKDistinceCharacters solution = new LongestSubstringWithAtMostKDistinceCharacters();

        System.out.println(
            solution.longestSubstringAtMostKDistinct(s, k)
        );
    }
}