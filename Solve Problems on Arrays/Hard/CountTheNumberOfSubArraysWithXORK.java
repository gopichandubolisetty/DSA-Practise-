public class CountTheNumberOfSubArraysWithXORK {
    public static void main(String[] args){
        int[] nums = {4,2,2,6,4};
        int length = nums.length;
        int k = 6;
        int ind1=-1;
        int ind2=-1;
        for(int i=0;i<length;i++){
            int sum =nums[i];
            if(sum==k){System.out.println("The sum is "+k+" at indexes ind1: "+i+" ind2: "+i);}
            for(int j=i+1;j<length;j++){
                sum=sum^nums[j];
                if(sum==k){
                    System.out.println("The sum is "+k+" from indexes ind1: "+i+" ind2: "+j);
                    if(j-i > ind2-ind1){ind1=i;ind2=j;}
                }
            }
        }
        System.out.println("The longest subarray is ind1: "+ind1+"ind2: "+ind2);
    }
}
