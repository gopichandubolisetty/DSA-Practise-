public class Checking_the_two_matrix_equal {
    public static void main(String[] args){
        boolean bo = true;
        int[][] m1 = {{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}};
        int[][] m2 = {{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}};
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(m1[i][j] != m2[i][j]){
                    bo=false;
            }
        }
    }

        if(bo){
             System.out.println("Given both matrixs are identical");
        }else{
            System.out.println("Given matrix are not identical");
        }
    }
}

