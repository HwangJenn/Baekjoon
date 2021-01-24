//45656이란 수를 보자.
//
//이 수는 인접한 모든 자리수의 차이가 1이 난다. 이런 수를 계단 수라고 한다.
//
//세준이는 수의 길이가 N인 계단 수가 몇 개 있는지 궁금해졌다.
//
//N이 주어질 때, 길이가 N인 계단 수가 총 몇 개 있는지 구하는 프로그램을 작성하시오. (0으로 시작하는 수는 없다.)
import java.util.*;
public class stairs_10844 {

    static Long[][] dp;
    static int n;
    final static long MOD = 1000000000;

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        dp = new Long[n+1][10];

        for(int i=0; i<10; i++){
            dp[1][i] = 1L;
        }
        long result =0;
        for(int i=1; i<=9; i++){
            result += recur(n,i);
        } System.out.println(result%MOD);
    } static long recur(int digit, int val){
        if(digit==1){
            return dp[digit][val];
        } if(dp[digit][val]==null){
            if(val==0){
                dp[digit][val]=recur(digit-1,1);
            } else if(val==9){
                dp[digit][val] = recur(digit-1,8);
            } else {
                dp[digit][val] = recur(digit-1, val-1)+recur(digit-1,val+1);
            }
        } return dp[digit][val]%MOD;
    }
}
