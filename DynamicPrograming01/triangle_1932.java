//맨 위층 7부터 시작해서 아래에 있는 수 중 하나를 선택하여 아래층으로 내려올 때, 이제까지 선택된 수의 합이 최대가 되는 경로를 구하는 프로그램을 작성하라. 아래층에 있는 수는 현재 층에서 선택된 수의 대각선 왼쪽 또는 대각선 오른쪽에 있는 것 중에서만 선택할 수 있다.
//
//삼각형의 크기는 1 이상 500 이하이다. 삼각형을 이루고 있는 각 수는 모두 정수이며, 범위는 0 이상 9999 이하이다.
import java.sql.Statement;
import java.util.*;
public class triangle_1932 {
    static int[][] arr;
    static Integer[][] dp;
    static int n;

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        n= scan.nextInt();

        arr = new int[n][n];
        dp = new Integer[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                arr[i][j] = scan.nextInt();
            }
        } for(int i=0; i<n; i++){
            dp[n-1][i] = arr[n-1][i];
        } System.out.println(find(0,0));
    } static int find(int depth, int idx){
        if(depth==n-1)return dp[depth][idx];
        if(dp[depth][idx]==null){
            dp[depth][idx]=Math.max(find(depth+1, idx), find(depth+1, idx+1))+arr[depth][idx];
        } return dp[depth][idx];
    }
}
