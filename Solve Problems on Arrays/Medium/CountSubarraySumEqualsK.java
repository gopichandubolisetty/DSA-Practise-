public class CountSubarraySumEqualsK {

    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {3,1,2,4};
        int k=6;
        int sum=0;
        int count=0;
        int len = arr.length;
        int p1=0;int p2=0;
        while(p2<len || sum>=k){
            if(sum<k){
                sum+=arr[p2];
                p2++;
            }
            if(sum==k){
                count++;
            }
            if(sum>=k){
                sum-=arr[p1];
                p1++;
            }
        }
        System.out.println(count);
    }
}
