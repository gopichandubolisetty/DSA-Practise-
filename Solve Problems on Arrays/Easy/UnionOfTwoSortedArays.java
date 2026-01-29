public class UnionOfTwoSortedArays {

    public static void printArray(int[] n){
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] newarray = new int[n1+n2];
        int l=0;
        int p1=0;
        for(int i=1 ;i<n1;i++){
            if(arr1[i-1]!=arr1[i]){
                newarray[l]=arr1[i-1];
                l++;
            }
        }
        if(arr1[n1-1]!=arr1[n1-2]){
            newarray[l] = arr1[n1-1];
        }
        int p2=0;
        while(p1<l){
            if(newarray[p1]<arr2[p2]){
                p1++;
            }
        }
        printArray(newarray);
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