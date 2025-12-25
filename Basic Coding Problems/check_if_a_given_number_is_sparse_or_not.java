public class check_if_a_given_number_is_sparse_or_not {
    public static void main(String[] args){
        int number = 12;
        String binary = Integer.toBinaryString(number);
        System.out.println(binary); 
        boolean bo = false;
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='1' && binary.charAt(i+1)=='1'){
                bo =true;
                break;
            }
        }

        if(bo){
            System.out.println("The given number is a sparse ");
        }else{
            System.out.println("The given number is not a sparse ");
        }
    }
}
