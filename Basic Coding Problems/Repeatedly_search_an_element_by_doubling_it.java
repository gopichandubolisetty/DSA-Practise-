public class Repeatedly_search_an_element_by_doubling_it {
    public static void main(String[] args){
        int[] a = {1, 2, 3,5,12};
        int b =3;
        int i=0;
        while(i<a.length){
            if(a[i]==b){
                b*=2;
                i=0;
            }
            i++;
        }
        System.out.println(b);
    }
}
