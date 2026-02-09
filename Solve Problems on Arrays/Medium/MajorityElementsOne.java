public class MajorityElementsOne {
    public static void main(String[] args){
        int[] nums = {7,0,0,1,7,7,2,7,7};
        int len = nums.length;
        int element =0;
        int p=0;int count =0;
        while(p<len){
            if(count==0){
                element = nums[p];
                count++;
            }else if(nums[p]==element){
                count++;
            }else{
                count--;
            }
            p++;
        }
        System.out.println("The Majority element in the array is : "+element);
    }
}
        

                                                     //Bruteforce 
        // boolean[] check = new boolean[len];
        // for(int i=0;i<len;i++){
        //     int count =0;
        //     if(!check[i]){
        //         count++;
        //         for(int j=i+1;j<len;j++){
        //             if(nums[i]==nums[j]){
        //                 check[j]=true;
        //                 count++;
        //             }
        //         }
        //     }
        //     if(count>n){
        //         element=nums[i];
        //     }
        // 
        
        
        
        
        
                                                            // Better Approach
        // }Arrays.sort(nums);
        // int count =1;
        // for(int i=0;i<len-1;i++){
        //     if(nums[i]==nums[i+1]){
        //         count++;
        //     }else{
        //         count =1;
        //     }
        //     if(count>n){
        //         element = nums[i];
        //     }
        // }