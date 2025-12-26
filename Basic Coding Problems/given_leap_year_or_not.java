public class given_leap_year_or_not {
    public static void main(String[] args){
        int n = 2021;
        if(n%400==0){
            System.out.println("Given year is a leap year");
        }else if(n%4==0 && n%100!=0){
            System.out.println("Given year is a leap year");
        }else{
            System.out.println("Given is not a leap year");
        }
    }
}
