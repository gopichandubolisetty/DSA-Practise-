public class SpiralMatrix{
    public static void main(String[] args){
        int[][] mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int top =0;
        int bottom = mat.length-1;
        int left = 0;
        int right = mat[0].length-1;

         while(top<=bottom && left<=right){

            for(int i=left;i<=right;i++){
                System.out.print(mat[top][i]+" ");
            }
            top++;

            for(int i=top;i<=bottom;i++){
                System.out.print(mat[i][right]+" ");
            }
            right--;

            if(top<=bottom){
                for(int i= right;i>=left;i--){
                    System.out.print(mat[bottom][i]+" ");
                }
                bottom--;
            }

            if(left<right){
                for(int i=bottom;i>=top;i--){
                    System.out.print(mat[i][left]+" ");
                }
                left++;
            }
         }
    }
}




            // Brute Force
// int p1=0;int p2=rowlen;
        //  while(p1<=p2){
        //     for(int i=p1;i<=collen-p1;i++){
        //         System.out.print(mat[p1][i]+" ");
        //     }
        //     for(int i=p1+1;i<=rowlen-p1;i++){
        //         System.out.print(mat[i][collen-p1]+" ");
        //     }
        //     for(int i=collen-1-p1;i>=p1;i--){
        //         System.out.print(mat[p2][i]+" ");
        //     }
        //     for(int i=rowlen-1-p1;i>p1;i--){
        //         System.out.print(mat[i][p1]+" ");
        //     }
        //     p1++;p2--;
        //  }