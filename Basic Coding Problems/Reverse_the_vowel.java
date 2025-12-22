public class Reverse_the_vowel {
    public static void main(String[] args){
        String strr = "helloworld";
        char[] arr = strr.toCharArray();
        int l=0;
        for(int i=0;i<arr.length;i++){
            char ch = arr[i];
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                l++;
            }
        }

        char[] va = new char[l];
        int k=0;
         for(int i=0;i<arr.length;i++){
            char ch = arr[i];
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                va[k] = ch;
                k++;
            }
         }

         char[] newarray = new char[arr.length];
         int j=0;
         for(int i=0;i<arr.length;i++){
            char ch = arr[i];
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                newarray[i] = va[va.length-j-1];
                j++;
            }else{
                newarray[i] = arr [i];
            }
         }

         String newword = new String(newarray);
         System.out.println("The new word is : "+newword);
    }
}
