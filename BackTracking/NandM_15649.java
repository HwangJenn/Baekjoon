//자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
//
//1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
import java.util.*;
public class NandM_15649 {
    public static int[] arr;
    public static boolean[] visit;
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        arr = new int[m];
        visit = new boolean[n];
        dfs(n, m, 0);
    }   public static void dfs(int n, int m, int depth){
        if(depth==m){
            for(int val : arr){
                System.out.print(val + " ");
            }System.out.println();
            return;
        }for(int i=0; i<n; i++){
            if(!visit[i]){
                visit[i] = true;
                arr[depth]=i+1;
                dfs(n,m,depth+1);
                visit[i]=false;
            }
        }
    }
}
