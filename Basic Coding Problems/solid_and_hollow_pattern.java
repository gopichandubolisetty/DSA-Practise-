public class solid_and_hollow_pattern {
    public static void main(String[] args){
        int n =4;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || i==3 || j==0 || j==3){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
