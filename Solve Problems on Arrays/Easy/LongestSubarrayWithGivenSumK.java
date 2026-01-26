public class LongestSubarrayWithGivenSumK {
    public static void main(String[] args){
        int[] arr = {10, 5, 2, 7, 1, 9};
        int n = arr.length;
        int p1=0;
        int p2=0;
        int ind1=-1;
        int ind2=-1;
        int k = 15;
        int sum=0;int maxlen=0;
        while(p2<n){
            sum+=arr[p2];
            while(sum>k && p1<=p2){
                sum-=arr[p1];
                p1++;
            }
            if(sum==k){
                int current = p2-p1+1;
                if(current>maxlen){
                    ind1=p1;
                    ind2=p2;
                }
                
            }
            p2++;
        }
        if(ind1==-1){
            System.out.println("No Subarray found");
        }else{
            System.out.println(ind1 + " "+ ind2);

        }
    }
}
