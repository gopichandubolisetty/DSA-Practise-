public class remove_Duplicates_From_The_Array {
    public static void main(String[] args){
        int[] n = {1,1,2,2,2,3,3};
        int l = n.length;
        int p1 = 0;
        for(int i=1;i<l;i++){
            if(n[p1]!=n[i]){
                n[p1+1]=n[i];
                p1++;
            }
        }

        for(int j=0;j<=p1;j++){
            System.out.print(n[j]+" ");
        }
    }
}

