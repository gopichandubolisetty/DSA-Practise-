public class factorial_number {
    public static void main(String[] args){
        int n = 5;
        int temp = n;
        int value =1;
        while(temp>0){
            value = value * temp;
            temp--;
        }
        System.out.println("The factorial value is : "+value+" for "+n );
    }
}
