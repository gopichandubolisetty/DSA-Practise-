public class IsomorphicString {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] mapS = new int[256];
        int[] mapT = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if (mapS[charS] != mapT[charT]) {
                return false;
            }

            mapS[charS] = i + 1;
            mapT[charT] = i + 1;
        }

        return true;
    }

    public static void main(String[] args) {
        IsomorphicString sol = new IsomorphicString();
        System.out.println(sol.isIsomorphic("egg", "add")); 
        System.out.println(sol.isIsomorphic("foo", "bar")); 
        System.out.println(sol.isIsomorphic("paper", "title")); 
    }
}