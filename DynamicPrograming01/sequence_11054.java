//수열 S가 어떤 수 Sk를 기준으로 S1 < S2 < ... Sk-1 < Sk > Sk+1 > ... SN-1 > SN을 만족한다면, 그 수열을 바이토닉 수열이라고 한다.
//
//예를 들어, {10, 20, 30, 25, 20}과 {10, 20, 30, 40}, {50, 40, 25, 10} 은 바이토닉 수열이지만,  {1, 2, 3, 2, 1, 2, 3, 2, 1}과 {10, 20, 30, 40, 20, 30} 은 바이토닉 수열이 아니다.
//
//수열 A가 주어졌을 때, 그 수열의 부분 수열 중 바이토닉 수열이면서 가장 긴 수열의 길이를 구하는 프로그램을 작성하시오.
import java.util.*;
public class sequence_11054 {
    static Integer[] r_dp;
    static Integer[] l_dp;
    static int[] seq;

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        r_dp = new Integer[n];
        l_dp = new Integer[n];
        seq = new int[n];

        for(int i=0; i<n; i++){
            seq[i] = scan.nextInt();
        } for(int i=0; i<n; i++){
            LIS(i);
            LDS(i);
        } int max = -1;
        for(int i=0; i<n; i++){
            max = Math.max(r_dp[i]+l_dp[i],max);
        } System.out.println(max-1);
    } static int LIS(int n){
        if(r_dp[n]==null){
            r_dp[n]=1;
            for(int i=n-1; i>=0; i--){
                if(seq[i]<seq[n]){
                    r_dp[n]= Math.max(r_dp[n],LIS(i)+1);
                }
            }
        }return r_dp[n];
    } static int LDS(int n){
        if(l_dp[n]==null){
            l_dp[n]=1;

            for(int i=n+1; i<l_dp.length; i++){
                if(seq[i]<seq[n]){
                    l_dp[n]=Math.max(l_dp[n],LDS(i)+1 );
                }
            }
        }return l_dp[n];
    }
}
