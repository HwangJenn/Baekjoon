//정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.
//
//X가 3으로 나누어 떨어지면, 3으로 나눈다.
//X가 2로 나누어 떨어지면, 2로 나눈다.
//1을 뺀다.
//정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최솟값을 출력하시오.
import java.util.*;
public class makeOne_1463 {

    static Integer[] dp;

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        dp = new Integer[n+1];
        dp[0] = dp[1] =0;

        System.out.print(recur(n));
    } static int recur(int n){
        if(dp[n]==null){
            if(n%6 ==0 ){
                dp[n] = Math.min(recur(n-1), Math.min(recur(n/3),recur(n/2)))+1;
            } else if(n%3 ==0){
                dp[n]= Math.min(recur(n/2), recur(n-1))+1;
            } else{
                dp[n] = recur(n-1)+1;
            }
        }return dp[n];
    }
}
