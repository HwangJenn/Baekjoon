//두 전봇대 A와 B 사이에 하나 둘씩 전깃줄을 추가하다 보니 전깃줄이 서로 교차하는 경우가 발생하였다. 합선의 위험이 있어 이들 중 몇 개의 전깃줄을 없애 전깃줄이 교차하지 않도록 만들려고 한다.
//
//예를 들어, <그림 1>과 같이 전깃줄이 연결되어 있는 경우 A의 1번 위치와 B의 8번 위치를 잇는 전깃줄, A의 3번 위치와 B의 9번 위치를 잇는 전깃줄, A의 4번 위치와 B의 1번 위치를 잇는 전깃줄을 없애면 남아있는 모든 전깃줄이 서로 교차하지 않게 된다.
//전깃줄이 전봇대에 연결되는 위치는 전봇대 위에서부터 차례대로 번호가 매겨진다. 전깃줄의 개수와 전깃줄들이 두 전봇대에 연결되는 위치의 번호가 주어질 때, 남아있는 모든 전깃줄이 서로 교차하지 않게 하기 위해 없애야 하는 전깃줄의 최소 개수를 구하는 프로그램을 작성하시오.
import java.util.*;
import java.util.Arrays;
import java.util.Comparator;
public class ele_2565 {
    static Integer[] dp;
    static int[][] wire;

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        dp = new Integer[n];
        wire = new int[n][2];

        for(int i=0; i<n; i++){
            wire[i][0]= scan.nextInt();
            wire[i][1] = scan.nextInt();
        } Arrays.sort(wire, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        }); int max=0;
        for(int i=0; i<n; i++){
            max = Math.max(recur(i), max);
        } System.out.println(n-max);
    } static int recur(int n){
        if(dp[n] == null){
            dp[n]=1;
            for(int i=n+1; i<dp.length; i++){
                if(wire[n][1]< wire[i][1]){
                    dp[n]=Math.max(dp[n], recur(i)+1);
                }
            }
        } return dp[n];
    }
}
