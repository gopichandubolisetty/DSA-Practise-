public class StringToInteger {
    public static void main(String[] args) {
        String str = "42";

        // Option 1: Returns a primitive int
        int result1 = Integer.parseInt(str);

        // Option 2: Returns an Integer object (wrapper class)
        Integer result2 = Integer.valueOf(str);

        System.out.println("Converted value: " + result1);
    }
}