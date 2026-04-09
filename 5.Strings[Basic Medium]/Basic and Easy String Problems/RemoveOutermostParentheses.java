public class RemoveOutermostParentheses {
    public static void main(String[] args){
        String paren = "(()())(())(()(()))";
        StringBuilder result = new StringBuilder();
        int count = 0;
        for(int i=0;i<paren.length();i++){
            
            if(paren.charAt(i)=='('){
                if(count>0){
                    result.append(paren.charAt(i));
                }
                count++;
            }else{
                count--;
                if(count>0){
                    result.append(paren.charAt(i));
                }
            }
        }
        System.out.println(result);
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