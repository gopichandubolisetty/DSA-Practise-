public class UnionOfTwoSortedArays {

    public static void printArray(int[] n,int l){
        for(int i=0;i<l;i++){
            System.out.print(n[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] arr1 = {2, 3, 4, 5, 6, 7,7, 8, 9};
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12,13};
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] newarray = new int[n1+n2];
        int l=0;
        int p1=0;
        int p2=0;
        while(p1<n1 && p2<n2 ){
            if(arr1[p1]<arr2[p2]){
                if(l==0 || (newarray[l-1] != arr1[p1])){
                newarray[l]=arr1[p1];
                l++;
            }
            p1++;
            }else if(arr1[p1]>arr2[p2]){
                if(l==0 || (newarray[l-1] != arr2[p2])){
                newarray[l]=arr2[p2];
                l++;
            }
            p2++;
            }
            else{
                if(l==0 || newarray[l-1] != arr1[p1]){
                    newarray[l] = arr1[p1];
                    l++;
                }
                p1++;
                p2++;
            }
        }
        while(p1<n1){
            if (l == 0 || newarray[l - 1] != arr1[p1]) {
                newarray[l++] = arr1[p1];
            }
            p1++;
            }

        while(p2<n2){
            if (l == 0 || newarray[l - 1] != arr2[p2]) {
                newarray[l++] = arr2[p2];
            }
            p2++;
        }
        printArray(newarray,l);
    }
}





                                                                    //FIRST METHOD
// for(int i=1;i<n1;i++){
//             if(arr1[i-1]!=arr1[i]){
//                 newarray[l]=arr1[i-1];
//                 l++;
//             }
//         }
//         if(arr1[n1-1]!=arr1[n1-2]){
//             newarray[l]=arr1[n1-1];
//             l++;
//         }
        
//         for(int i=0;i<n2;i++){
//             int k =0;
//             boolean ch = true;
//             while(k<l){
//                 if(newarray[k]==arr2[i]){
//                     ch=false;
//                 }
//                 k++;
//             }
//             if(ch){
//                 newarray[l] = arr2[i];
//                 l++;
//             }

//         }
//         for(int i=0;i<l;i++){
//             for(int j=0;j<l-i-1;j++){
//                 if(newarray[j]>newarray[j+1]){
//                     int temp = newarray[j];
//                     newarray[j]=newarray[j+1];
//                     newarray[j+1]=temp;
//                 }
//             }
//         }