public class CheckIfTheIthBitIsSetOrNot {
    public static void main(String[] args) {
        int n = 5;
        int i = 2;

        boolean isSet = (n & (1 << i)) != 0;

        if (isSet) {
            System.out.println("The " + i + "-th bit of " + n + " is set (1).");
        } else {
            System.out.println("The " + i + "-th bit of " + n + " is not set (0).");
        }
    }
}