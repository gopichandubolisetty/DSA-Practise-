public class Find_Nth_Root_Of_The_Number {
    public static void main(String[] args){
        int n = 3;
        int m = 27;
        int low=1,high=m,ans=-1;

        while(low<=high){
            int mid = (int)(low+high)/2;
            int power = (int)Math.pow(mid,n);

            if(power==m){
                ans =  mid;
                System.out.println("The answer is "+mid);
            }

            if(power<m){
                ans= mid;
                low=mid+1;
            }else{
                high = mid-1;
            }

        }
    }
}
