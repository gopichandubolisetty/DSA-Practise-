public class NumberOccuringOddNumberOfTimes {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 2, 3, 1, 3};
        int num=0;
        for(int i=0;i<arr.length;i++){
            int count =0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    num = arr[i];
                }
            }
        }
        System.out.println(num);
    }
}
