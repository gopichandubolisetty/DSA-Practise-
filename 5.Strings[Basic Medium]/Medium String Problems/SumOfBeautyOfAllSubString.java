public class SumOfBeautyOfAllSubString {
    public static void main(String[] args) {
        String s = "aabcb";
        System.out.println(beautySum(s));
    }

    public static int beautySum(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int[] count = new int[26];
            for (int j = i; j < s.length(); j++) {
                count[s.charAt(j) - 'a']++;
                res += getBeauty(count);
            }
        }
        return res;
    }

    private static int getBeauty(int[] count) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int val : count) {
            if (val > 0) {
                max = Math.max(max, val);
                min = Math.min(min, val);
            }
        }
        return (max == Integer.MIN_VALUE) ? 0 : max - min;
    }
}