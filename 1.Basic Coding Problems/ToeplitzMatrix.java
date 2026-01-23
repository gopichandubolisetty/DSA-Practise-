public class ToeplitzMatrix {
    public static void main(String[] args){
        int[][] mat = {{6,7,8},{4,6,7},{1,4,6}};
        boolean bo = true;
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                if(mat[i][j]!=mat[i+1][j+1]){
                    bo = false;
                    break;
                }
            }
        }

        if(bo){
            System.out.println("Given matrix is a Toeplitz");
        }else{
            System.out.println("Given matrix is not a toeplitz ");
        }
    }
}
