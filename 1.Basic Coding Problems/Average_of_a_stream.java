public class Average_of_a_stream {
    public static void main(String[] args){
        int[] n = {10,20,30,40,50,60};
        int i=0;
        int sum=0;
        while(i<n.length){
            sum = sum + n[i];
            System.out.println("Average of "+(i+1)+" numbers is "+ sum/(i+1));
            i++;
        }
    }
}
