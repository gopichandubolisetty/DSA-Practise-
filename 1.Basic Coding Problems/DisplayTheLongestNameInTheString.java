
public class DisplayTheLongestNameInTheString {
    public static void main(String[] args){
        String[] arr = {"GeeksforGeeks", "FreeCodeCamp", "StackOverFlow", "MyCodeSchool"};
        int maxlength =0;

        for(int i=0;i<arr.length;i++){
            if(arr[i].length()>maxlength){
                maxlength = arr[i].length();
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i].length() == maxlength){
                System.out.println(arr[i]);
            }
        }
    }
}
