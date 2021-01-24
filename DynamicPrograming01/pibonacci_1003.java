//fibonacci(3)을 호출하면 다음과 같은 일이 일어난다.
//
//fibonacci(3)은 fibonacci(2)와 fibonacci(1) (첫 번째 호출)을 호출한다.
//fibonacci(2)는 fibonacci(1) (두 번째 호출)과 fibonacci(0)을 호출한다.
//두 번째 호출한 fibonacci(1)은 1을 출력하고 1을 리턴한다.
//fibonacci(0)은 0을 출력하고, 0을 리턴한다.
//fibonacci(2)는 fibonacci(1)과 fibonacci(0)의 결과를 얻고, 1을 리턴한다.
//첫 번째 호출한 fibonacci(1)은 1을 출력하고, 1을 리턴한다.
//fibonacci(3)은 fibonacci(2)와 fibonacci(1)의 결과를 얻고, 2를 리턴한다.
//1은 2번 출력되고, 0은 1번 출력된다. N이 주어졌을 때, fibonacci(N)을 호출했을 때, 0과 1이 각각 몇 번 출력되는지 구하는 프로그램을 작성하시오.
import java.util.*;
public class pibonacci_1003 {
    static Integer[][] dp = new Integer[41][2];
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        int t = scan.nextInt();

        while (t-->0){
            int n = scan.nextInt();
            fibonacci(n);
            System.out.println(dp[n][0]+" "+dp[n][1]);
        }
    } static Integer[] fibonacci(int n){
        if(dp[n][0]==null || dp[n][1] == null){
            dp[n][0] = fibonacci(n-1)[0] + fibonacci(n-2)[0];
            dp[n][1] = fibonacci(n-1)[1] + fibonacci(n-2)[1];
        } return dp[n];
    }
}
