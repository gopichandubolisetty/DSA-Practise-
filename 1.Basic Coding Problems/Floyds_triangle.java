public class Floyds_triangle {
    public static void main(String[] args){
        int n = 5;
        int l=1;
        for(int i =1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(l+" ");
                l++;
            }
            System.out.println();
        }
    }
}
