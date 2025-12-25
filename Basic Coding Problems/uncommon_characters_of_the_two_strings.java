public class uncommon_characters_of_the_two_strings {
    public static void main(String[] args){
        String s1 = "geeksforgeeks";
        String s2 =  "geeksquiz";
        int l1 = s1.length();
        int l2 = s2.length();
        String c1,c2;
        if(l1>=l2){
            c1=s1;
            c2=s2;
        }else{
            c1=s2;
            c2=s1;
        }

        int[] count = new int[26];
        for(int i=0;i<c1.length();i++){
            for(int j=0;j<c2.length();j++){
                if(c1.charAt(i) == c2.charAt(j)){
                    count[c1.charAt(i)-'a']++;
                    count[c2.charAt(j)-'a']++;
                }
            }
        }        

        for(int i=0;i<c1.length();i++){
            if(count[c1.charAt(i)-'a']==0){
                System.out.println(c1.charAt(i)+" ");
            }
        }

        for(int i=0;i<c2.length();i++){
            if(count[c2.charAt(i)-'a']==0){
                // System.out.println("These are the non repeating characters from the both strings: ");
                System.out.println(c2.charAt(i)+" ");
            }
        }

    }
}

//Gemini code

// public class UncommonChars {
//     public static void main(String[] args) {
//         String s1 = "geeksforgeeks";
//         String s2 = "geeksquiz";

//         boolean[] presentInS1 = new boolean[26];
//         boolean[] presentInS2 = new boolean[26];

//         for (int i = 0; i < s1.length(); i++) {
//             presentInS1[s1.charAt(i) - 'a'] = true;
//         }

//         for (int i = 0; i < s2.length(); i++) {
//             presentInS2[s2.charAt(i) - 'a'] = true;
//         }

//         for (int i = 0; i < 26; i++) {
//             if (presentInS1[i] ^ presentInS2[i]) {
//                 System.out.print((char) (i + 'a') + " ");
//             }
//         }
//     }
// }
