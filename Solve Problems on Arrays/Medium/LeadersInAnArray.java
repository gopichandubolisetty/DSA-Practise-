public class LeadersInAnArray {
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args){
        int[] arr = {10,22,12,3,0,6};
        int len = arr.length;
        int max = arr[len-1];
        
        for(int i=len-2;i>=0;i--){
            if(arr[i]>max){
                System.out.print(arr[i]+" ");
                max =arr[i];
            }
        }
        System.out.print(arr[len-1]+" ");
    }
}



                            // Brute force approach
// for(int i=0;i<len;i++){
//             boolean check = true;
//             for(int j=i+1;j<len;j++){
//                 if(arr[i]<arr[j]){
//                     check = false;
//                 }
//             }
//             if(check){
//                 System.out.print(arr[i]+" ");
//             }
//       } 
//         int p1=0;
//         int p2=1;
//         boolean check=true;
//         while(p1!=len-1){
//             if(arr[p1]<arr[p2]){
//                 check=false;
//             }
//             if(p2==len-1){
//                 if(check==true){
//                     System.out.print(arr[p1]+" ");
//                 }
//                 p1++;
//                 p2=p1+1;
//                 check=true;
//             }else{
//                 p2++;
//             }
//         }
//         System.out.println(arr[len-1]);