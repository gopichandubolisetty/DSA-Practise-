public class MajorityElementTwo {
    public static void main(String[] args){
        int[] nums = {1,2,1,1,3,2};
        int len = nums.length;
        int co1=0;
        int co2=0;
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;
        for(int i=0;i<len;i++){
            if(co1==0 && nums[i]!=ele2){
                ele1 = nums[i];
                co1++;
            }else if(co2==0 && nums[i]!=ele1){
                ele2 = nums[i];
                co2++;
            }else if(nums[i]==ele1){
                co1++;
            }else if(nums[i]==ele2){
                co2++;
            }else{
                co1--;
                co2--;
            }
        }
        co1=0;co2=0;
        for(int i=0;i<len;i++){
            if(nums[i]==ele1){co1++;}
            if(nums[i]==ele2){co2++;}
        }
        int n = len/3;
        if(co1>n){
            System.out.println(ele1);
        }
        if(co2>n){
            System.out.println(ele2);
        }
    }
}
