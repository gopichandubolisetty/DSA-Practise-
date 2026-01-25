public class LongestSubArrayWithGIvenSumK {

    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] arr = {51,65,-54,5,36,78,-24,-54,151};
        int n = arr.length-1;
        int ri =n;
        int lf=0;
        int sum=0;
        for(int l=1;l<n;l++){
            int temp =0;
            int j = lf;
            while(j<=ri){
                temp+=arr[j];
                j++;
            }
            if(temp>sum){
                sum=temp;
            }else{
                lf++;
            }
        }
        System.out.println("right: "+ri+"left: "+lf);
    }
}
