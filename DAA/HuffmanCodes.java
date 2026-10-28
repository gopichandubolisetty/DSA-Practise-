import java.util.Scanner;

public class HuffmanCodes {
    public static String decodeHuffman(int n, String[] c,String[] d,String e){
        StringBuilder r = new StringBuilder();
        String t ="";
        for(char x: e.toCharArray()){
            t+=x;
            for(int i=0;i<n;i++){
                if(t.equals(d[i])){
                    r.append(c[i]);
                    t="";
                    break;
                }
            }
        }
        return r.toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] c = new String[n];
        String[] d = new String[n];
        for(int i=0;i<n;i++){
            c[i]=sc.next();
        }
        for(int i=0;i<n;i++){
            d[i]=sc.next();
        }
        sc.nextLine();
        String en = sc.nextLine().trim();
        String ans = decodeHuffman(n,c,d,en);
        System.out.println(ans);
        
    }
}
