public class Gcd {
    public static void main(String[] args){
        int a =2;
        int b =3;
        // if(a==0 || b==0){
        //     System.out.println("GCD doesn't exist");
        //     return;
        // }else if(a==1 || b==1){
        //     System.out.println("GCD is 1");
        //     return;
        // }
        // int GCD=1;
        // int bi,sm;
        // bi = (a>b) ? a: b;
        // sm = (a>b) ? b :a;
        // for(int i=sm;i>0;i--){
        //     if(sm%i==0 && bi%i==0){
        //         if(i>GCD){
        //             GCD = i;
        //         }
        //     }
        // }
        // System.out.println("GCD is : "+GCD);


        //Optimal Approach

        while(b>0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        System.out.println("GCD is : "+a );

    }
}


