//자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
//1부터 N까지 자연수 중에서 M개를 고른 수열
//같은 수를 여러 번 골라도 된다.
//고른 수열은 비내림차순이어야 한다.
//길이가 K인 수열 A가 A1 ≤ A2 ≤ ... ≤ AK-1 ≤ AK를 만족하면, 비내림차순이라고 한다.
import java.util.*;
public class NandM_15652 {
    public static int[] arr;
    public static int n,m;
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        arr = new int[m];
        dfs(1,0);
    }
    public static void dfs(int at, int depth){
        if(depth==m){
            for(int val : arr){
                System.out.print(val + " ");
            }System.out.println();
            return;
        }for(int i=at; i<=n; i++){
            arr[depth]=i;
            dfs(i,depth+1);
        }
    }
}
