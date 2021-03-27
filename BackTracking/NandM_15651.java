//자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
//1부터 N까지 자연수 중에서 M개를 고른 수열
//같은 수를 여러 번 골라도 된다.
import java.util.*;
public class NandM_15651 {
    public static int[] arr;
    public static int n,m;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        n= scan.nextInt();
        m= scan.nextInt();
        arr = new int[m];
        dfs(0);
        System.out.print(sb);
    }public static void dfs(int depth){
        if(depth == m){
            for(int i=0; i<m; i++) {
                sb.append(arr[i] + " ");
            }
                sb.append('\n');
                return;
            }for(int i=1; i<=n; i++){
                arr[depth]=i;
                dfs(depth+1);
            }
        }
    }

