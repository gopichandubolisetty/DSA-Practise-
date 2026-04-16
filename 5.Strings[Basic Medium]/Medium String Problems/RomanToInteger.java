public class RomanToInteger {

    public static int romanToInt(String s) {
        int[] vals = new int[128];
        vals['I'] = 1;
        vals['V'] = 5;
        vals['X'] = 10;
        vals['L'] = 50;
        vals['C'] = 100;
        vals['D'] = 500;
        vals['M'] = 1000;
        int val = 0;
        char[] chars = s.toCharArray();
        int n = chars.length;
        
        for (int i = 0; i < n - 1; i++) {
            if (vals[chars[i]] < vals[chars[i + 1]]) {
                val -= vals[chars[i]];
            } else {
                val += vals[chars[i]];
            }
        }
        
        val += vals[chars[n - 1]];
        return val;
    }


    public static void main(String[] args){
        String s = "LVIII";
        int val = romanToInt(s);
        System.out.println(val);
    }
}
