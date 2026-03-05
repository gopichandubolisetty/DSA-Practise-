public class RoatateMatrixByNintyDegrees {

    public static void printArray(int[][] mat){
        int length = mat.length;
        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int[][] matrix = {{5,1,9,11},{4,7,8,9},{4,5,3,8,7},{1,6,9,74}};
        int length = matrix.length;
        int len = length-1;
        printArray(matrix);
        System.out.println();
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        printArray(matrix);
        System.out.println();

        int p1=0;int p2=len;
        int count =0;
        while(count<length){
            while(p1<p2){
                int temp = matrix[count][p1];
                matrix[count][p1] = matrix[count][p2];
                matrix[count][p2]=temp;
                p1++;
                p2--;
            }
            p1=0;p2=len;
            count++;
        }
        printArray(matrix);
    }
}
// Brute Force
// printArray(matrix);
//         System.out.println();
//         int length = matrix.length-1;
//         int[][] newmat = new int[length+1][length+1];
//         for(int i=0;i<=length;i++){
//             for(int j=0;j<=length;j++){
//                 newmat[i][length-j]=matrix[j][i];
//             }
//         }
//         printArray(newmat);