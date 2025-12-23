public class sum_of_gp {
    public static void main(String[] args){
        int n =3;
        double r =0.5;
        int a =1;
        double sum=1;
        for(int i=1;i<n;i++){
            sum+=a*Math.pow(r,i);
        }
        System.out.println("The sum of the gp is : "+sum);
    }
}
