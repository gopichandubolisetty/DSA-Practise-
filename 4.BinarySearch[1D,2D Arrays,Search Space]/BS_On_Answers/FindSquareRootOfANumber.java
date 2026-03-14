public class FindSquareRootOfANumber {
    public static void main(String[] args){
        int n = 38;
        int low =1;
        int high = n/2;
        int ans=0;
        while(low<=high){
            int mid = (low+high)/2;
            int sq = mid*mid;
            if(sq== n){
                ans=(int)mid;
                break;
            }

            if(sq<=n){
                ans=(int)mid;
               low=mid+1;
            }else{
                 high = mid-1;
            }
        }

        System.out.println(ans);

    }
}
