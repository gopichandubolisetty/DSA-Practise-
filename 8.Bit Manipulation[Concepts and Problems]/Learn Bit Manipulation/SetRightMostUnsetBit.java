public class SetRightMostUnsetBit {
    public static int setRightmostUnsetBit(int n) {
        return n | (n + 1);
    }

    public static void main(String[] args) {
        System.out.println(setRightmostUnsetBit(10));
        System.out.println(setRightmostUnsetBit(13));
    }
}