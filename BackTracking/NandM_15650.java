//자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
//
//1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
//고른 수열은 오름차순이어야 한다.
import java.util.*;
public class NandM_15650 {
    public static int[] arr;
    public static int n,m;
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        n= scan.nextInt();
        m= scan.nextInt();
        arr=new int[m];
        dfs(1,0);
    }public static void dfs(int at, int depth){
        if(depth==m){
            for(int val:arr){
                System.out.print(val+" ");
            }System.out.println();
            return;
        }for(int i=at; i<=n; i++){
            arr[depth]=i;
            dfs(i+1, depth+1);
        }
    }
}
