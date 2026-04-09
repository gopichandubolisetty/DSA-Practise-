public class RemoveOutermostParentheses {
    public static void main(String[] args){
        String paren = "(()())(())(()(()))";
        int count = 0;
        for(int i=0;i<paren.length();i++){
            
            if(paren.charAt(i)=='('){
                if(count>0){
                    System.out.print(paren.charAt(i));
                }
                count++;
            }else{
                count--;
                if(count>0){
                    System.out.print(paren.charAt(i));
                }
            }
        }
    }
}


            // First Code
// for(int i=0;i<paren.length();i++){

//             if(count>0){
//                 check = true;
//             }else{
//                 check = false;
//             }

//             if(paren.charAt(i)=='('){
//                 count++;
//             }else{
//                 count--;
//             }


//             if(check && count!=0) {
//                 System.out.print(paren.charAt(i));
//             }
//         }