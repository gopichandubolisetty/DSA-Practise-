import java.util.Arrays;

public class ChooseElementsHavingMaxAndMin {
    public static void main(String[] args){
        int[] n = {7,3,2,4,9,12,56};
        Arrays.sort(n);
        int m =3;
        int diff = Integer.MAX_VALUE;

        for(int i=0;i+m-1<n.length;i++){
            if(n[i+m-1]-n[i]<diff){
                diff = n[i+2]-n[i];
            }
        }

        System.out.println(diff);
    }
}
