public class PascalsTriangle {

    public static void printArray(int[] num){
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
    public static int[] getPascalTriangle(int[] num,int n){
        if(n<0){
            return num;
        }
        printArray(num);
        int newlen = num.length+1;
        int[] newarray = new int[newlen];
        newarray[0]=1;newarray[newlen-1]=1;
        for(int i=1;i<newlen-1;i++){
            newarray[i]=num[i-1]+num[i];
        }
        return getPascalTriangle(newarray,n-1);
    }
    public static void main(String[] args){
        int n = 4;
        int[] arr = {1};
        getPascalTriangle(arr,n);
    }

}
