import java.util.*;
public class LCS {
   static Set<String> getAIILCS(String s1,String s2){
    int m  = s1.length();
    int n = s2.length();
    int[][] dp = new int[m+1][n+1];
    for(int i=1;i<=m;i++){
        for(int j=1;j<=n;j++){
            if(s1.charAt(i-1)==s2.charAt(j-1)){
                dp[i][j]=dp[i-1][j-1]+1;
            }else{
                dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
    }
    return backTrack(s1,s2,m,n,dp);

    static Set<String> backTrack(String s1,String s2,int i,int j,int[][] dp){
        if(m==0||n==0){
            return new HashSet<>(Collections.singletonList(""));
        }

        Set<String> res = new HashSet<>();

        if(s1.charAt(i-1)==s2.charAt(j-1)){
            for(String s : backTrack(s1,s2,i-1,j-1,dp)){
                res.add(s+s1.charAt(i-1));
            }
        }else{
            if(dp[i-1][j]>=dp[i][j-1]){
                res.addAll(backTrack(s1,s2,i-1.j,dp));
            }
            if(dp[i][j-1]>=dp[i-1][j]){
                res.addAll(backTrack(s1,s2,i,j-1,dp));
            }
        }
        return res;
    }
   } 
}
