public class SumOfArrayElementTwo {
    public static int sum(int[] a,int p){
        if(p==a.length){
            return 0;
        }
        return a[p]+sum(a,p+1);
    }

    public static void main(String[] args){
        int[] arr = {1,5,4};
        System.out.println(sum(arr,0));
    }
}
