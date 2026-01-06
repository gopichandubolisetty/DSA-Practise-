public class program_to_print_right_triangle_pattern {
    public static void main(String[] args){
        int n = 5;
        
        for(int i=0;i<n;i++){
            for(int j=0 ;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
