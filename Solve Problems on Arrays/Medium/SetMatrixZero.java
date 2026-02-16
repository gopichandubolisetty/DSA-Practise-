public class SetMatrixZero {

    public static void printArray(int[][] arr){
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
        boolean firstrow = false;
        boolean firstcolumn=false;
         
        for(int i=0;i<collen;i++){
            if(mat[0][i]==0){
                firstrow=true;
            }
        }

        for(int j=0;j<rowlen;j++){
            if(mat[j][0]==0){
                firstcolumn=true;
            }
        }

        System.out.println(firstrow+" "+firstcolumn);
    
        for(int i=0;i<rowlen;i++){
            for(int j=0;j<collen;j++){
                if(mat[i][j]==0){
                    mat[i][0]=0;
                    mat[0][j]=0;
                }
            }
        }

        printArray(mat);
        System.out.println();

        for(int i=1;i<rowlen;i++){
            for(int j=1;j<collen;j++){
                if(mat[i][0]==0|| mat[0][j]==0){
                    mat[i][j]=0;
                }
            }
        }

        if(firstrow){
            for(int i=0;i<collen;i++){
                mat[0][i]=0;
            }
        }

        if(firstcolumn){
            for(int i=0;i<rowlen;i++){
                mat[i][0]=0;
            }
        }

        printArray(mat);
    }    
}








                                                                // Brute Force Approach
        // int total = rowlen*collen;
        // int[] row = new int[total];
        // int[] col = new int[total];
        // int ind=0;
        // PrintArray(mat);
        // for(int i=0;i<rowlen;i++){
        //     for(int j=0;j<collen;j++){
        //         if(mat[i][j]==0){
        //             row[ind]=i;
        //             col[ind]=j;
        //             ind++;
        //         }
        //     }
        // }
        // for(int i=0;i<row.length;i++){
        //     System.out.print(row[i]+" ");
        // }
        // System.out.println();

        // for(int i=0;i<col.length;i++){
        //     System.out.print(col[i]+" ");
        // }
        // System.out.println();

        // for(int i=0;i<row.length;i++){
        //     for(int j=0;j<collen;j++){
        //         mat[row[i]][j]=0;
        //     }
        // }

        // for(int i=0;i<col.length;i++){
        //     for(int j=0;j<rowlen;j++){
        //         mat[j][col[i]]=0;
        //     }
        // }

        // PrintArray(mat);