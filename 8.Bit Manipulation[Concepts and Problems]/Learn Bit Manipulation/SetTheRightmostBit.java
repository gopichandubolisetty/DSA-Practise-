public class SetTheRightmostBit {
    public static void main(String[] args){
        int n = 10;
        System.out.println(n+" "+Integer.toBinaryString(n));
        n = n | (n+1);
        System.out.println(n+" "+Integer.toBinaryString(n));
    }
}
