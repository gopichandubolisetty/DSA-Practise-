public class Extract_the_integer_from_the_string {
    public static void main(String[] args){
        String in = "1Hello2 &*how are y5ou";
        char[] array = in.toCharArray();
        String intege = "";
        for(int i=0;i<array.length;i++){
            if(array[i]>='0' && array[i]<='9'){
                System.out.println(array[i]);
                intege+=array[i];
            }
        }
        System.out.println("The numbers in the string are : "+intege);
    }
}
