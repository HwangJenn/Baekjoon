//수열 A가 주어졌을 때, 가장 긴 증가하는 부분 수열을 구하는 프로그램을 작성하시오.
//
//예를 들어, 수열 A = {10, 20, 10, 30, 20, 50} 인 경우에 가장 긴 증가하는 부분 수열은 A = {10, 20, 10, 30, 20, 50} 이고, 길이는 4이다.
import java.util.*;
public class sequence_11053 {
    static int[] seq;
    static Integer[] dp;

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        seq = new int[n];
        dp = new Integer[n];

        for(int i=0; i<n; i++){
            seq[i] = scan.nextInt();
        } for(int i=0; i<n; i++){
            LTS(i);
        } int max = dp[0];
        for(int i=1; i<n; i++){
            max = Math.max(max, dp[i]);
        } System.out.println(max);
    } static int LTS(int n){
        if(dp[n] == null){
            dp[n]=1;
            for(int i=n-1; i>=0; i--){
                if(seq[i]<seq[n]){
                    dp[n]=Math.max(dp[n], LTS(i)+1);
                }
            }
        } return dp[n];
    }
}
