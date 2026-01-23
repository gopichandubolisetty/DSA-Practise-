public class FadcinatingNumber {
    public static void main(String[] args){
        int n1 = 192;
        int temp = n1;
        int len =0;
        while(temp>0){
            len++;
            temp/=10;
        }
        System.out.println(len);
        if(len!=3){
           return;
        }
        int n2 = n1*2;
        int n3 = n1*3;
        String st = ""+n1+n2+n3;
        System.out.println(st);
        int[] n = new int[10];
        for(int i=0;i<9;i++){
            n[st.charAt(i)-'0'] ++;
        }

        boolean ch = true;
        for(int i=1;i<=9;i++){
            if(n[i]!=1){
                ch = false;
                break;
            }
        }

        if(ch){
            System.out.println("Given number is a fadcinating number");
        }else{
            System.out.println("Given number is not a  fadcinating number");
        }

    }
}
