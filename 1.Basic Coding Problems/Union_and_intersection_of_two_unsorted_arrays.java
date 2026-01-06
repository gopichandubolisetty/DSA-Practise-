public class Union_and_intersection_of_two_unsorted_arrays {
    public static void main(String[] args){
        int[] a1 = {1,2,3,4,5,6};
        int[] a2 = {1,2,3,4,5,6};
        int len = a1.length+a2.length;
        int[] re = new int[len];
        int[] inter = new int[len];
        int k=0;
        int n=0;
        for(int i=0;i<a1.length;i++){
            if(k<len){
                boolean bo = false;
                for(int j=0;j<=k;j++){
                    if(a1[i] == re[j]){
                        bo = true;
                        break;
                    }
                }
                if(!bo){
                    re[k] = a1[i];
                    k++;
                }
            }
        }

        for(int i=0;i<a2.length;i++){
            if(k<len){
                boolean bo = false;
                for(int j=0;j<=k;j++){
                    if(a2[i] == re[j]){
                        bo = true;
                        break;
                    }
                }
                if(!bo){
                    re[k] = a2[i];
                    k++;
                }
            }
        }

        for(int i=0;i<k;i++){
            System.out.print(re[i]);
        }

        System.out.println();

        for(int i=0;i<a1.length;i++){
            if(n<len){
                boolean bo = false;
                for(int j=0;j<a2.length;j++){
                    if(a1[i] == a2[j]){
                        bo = true;
                    }
                   
                } if(bo){
                        inter[n] = a1[i];
                        n++;
                    }
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(inter[i]);
        }


    }
}
