public class SetMatrixZero {

    public static void PrintArray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int[][] mat = {{1,1,1,1},{1,1,0,1},{1,1,1,1}};
        int rowlen = mat.length;
        int collen = mat[0].length;
        int rowind=-1;
        int colind=-1;
        for(int i=0;i<rowlen;i++){
            for(int j=0;j<collen;j++){
                if(mat[i][j]==0){
                    rowind =i;
                    colind =j;
                }
            }
        }
        if(rowind==-1){
            System.out.println("The matrix doesn't contains zeros");
            return;
        }
        for(int i=0;i<collen;i++){
            mat[rowind][i]=0;
        }
        for(int i=0;i<rowlen;i++){
            mat[i][colind]=0;
        }

        PrintArray(mat);
    }    
}
