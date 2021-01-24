//재귀 호출만 생각하면 신이 난다! 아닌가요?
//다음과 같은 재귀함수 w(a, b, c)가 있다.
//if a <= 0 or b <= 0 or c <= 0, then w(a, b, c) returns:
//    1
//
//if a > 20 or b > 20 or c > 20, then w(a, b, c) returns:
//    w(20, 20, 20)
//
//if a < b and b < c, then w(a, b, c) returns:
//    w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c)
//
//otherwise it returns:
//    w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1)
//위의 함수를 구현하는 것은 매우 쉽다. 하지만, 그대로 구현하면 값을 구하는데 매우 오랜 시간이 걸린다. (예를 들면, a=15, b=15, c=15)
//
//a, b, c가 주어졌을 때, w(a, b, c)를 출력하는 프로그램을 작성하시오.
import java.util.*;
public class fx_9184 {
    static int[][][] dp = new int[21][21][21];
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        while (true){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();

            if(a==-1 && b==-1 && c==-1){
                break;
            }System.out.printf("w(%d, %d, %d) = %d\n",a, b,c,w(a,b,c));
        }
    } static int w(int a, int b, int c){
        if(inRange(a,b,c)&&dp[a][b][c]!=0){
            return dp[a][b][c];
        } if(a<=0 || b<=0 || c<=0){
            return 1;
        } if(a>20 || b>20 || c>20){
            return dp[20][20][20] = w(20,20,20);
        } if(a<b && b<c){
            return dp[a][b][c]=w(a,b,c-1)+w(a,b-1, c-1)- w(a,b-1,c);
        } return dp[a][b][c] = w(a-1,b,c) + w(a-1, b-1, c)+ w(a-1, b, c-1)-w(a-1,b-1, c-1);
    } static boolean inRange(int a, int b , int c){
        return 0<= a && a<=20 && 0<=b && b<=20 && 0 <= c&& c<=20;
    }
}
