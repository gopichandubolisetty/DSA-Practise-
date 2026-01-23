public class SecondLargestElementInArray {
    public static void main(String[] args){
        int[] arr = {1,5,7,8,7,5,7,3,3};
        int n = arr.length;
        int ind=0;
        int secbig=0;
        for(int i=0;i<n;i++){
            if(arr[ind]<arr[i]){
                ind =i;
            }
        }

        for(int j=0;j<n;j++){
            if(j==ind){
            }else{
                if(secbig<arr[j]){
                    secbig=arr[j];
                }
            }
        }

        System.out.println("The second biggest number is : "+secbig);
    }
}
