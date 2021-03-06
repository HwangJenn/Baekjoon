//LCS(Longest Common Subsequence, 최장 공통 부분 수열)문제는 두 수열이 주어졌을 때, 모두의 부분 수열이 되는 수열 중 가장 긴 것을 찾는 문제이다.
//예를 들어, ACAYKP와 CAPCAK의 LCS는 ACAK가 된다.
import java.util.*;
public class LCS_9251 {
    static char[] str1;
    static char[] str2;

    static Integer[][] dp;

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        str1 = scan.nextLine().toCharArray();
        str2 = scan.nextLine().toCharArray();
        dp = new Integer[str1.length][str2.length];

        System.out.println(LCS(str1.length-1, str2.length-1));
    } static int LCS(int x, int y){
        if(x==-1 || y==-1 ){
            return 0;
        } if(dp[x][y]==null){
            dp[x][y]=0;
            if(str1[x]==str2[y]){
                dp[x][y] = LCS(x-1, y-1)+1;
            } else{
                dp[x][y]=Math.max(LCS(x-1,y), LCS(x,y-1));
            }
        } return dp[x][y];
    }
}
