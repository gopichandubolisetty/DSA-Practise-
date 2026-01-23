public class ReplaceAll0With5InAnInteger {
    public static void main(String[] args){
        int n = 102;
        int temp = 0;
        while(n>0){
            if(n%10==0){
                temp = temp*10+5;
            }else{
                temp = temp*10+n%10;
            }
            n/=10;
        }
        System.out.println(temp);
        int newn=0;

        while(temp > 0){
        newn = newn *10 + temp%10;
        temp/=10;
        }
        System.out.println(newn);
    }
    
}
