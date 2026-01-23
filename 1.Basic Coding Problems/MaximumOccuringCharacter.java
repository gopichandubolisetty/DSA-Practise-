public class MaximumOccuringCharacter {
    public static void main(String[] args){
        String in = "geeksforgeeks";
        int[] count = new int[256];
        for(int i=0;i<in.length();i++){
            count[in.charAt(i)]++;
        }

        int max = -1;
        char result = ' ';
         for(int i=0;i<in.length();i++){
            if(max<count[in.charAt(i)]){
                max = count[in.charAt(i)];
                result = in.charAt(i);
            }
         }
         System.out.println("The maximum times repeated letter is : "+result);
    }
}
