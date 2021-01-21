//N-Queen 문제는 크기가 N × N인 체스판 위에 퀸 N개를 서로 공격할 수 없게 놓는 문제이다.
//
//N이 주어졌을 때, 퀸을 놓는 방법의 수를 구하는 프로그램을 작성하시오.
import java.util.*;
public class queen_9663 {
    public static int[] arr;
    public static int n;
    public static int count = 0;
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        arr = new int[n];
        nQueen(0);
        System.out.println(count);
    }public static void nQueen(int depth){
        if(depth==n){
            count++;
            return;
        }for(int i=0; i<n; i++){
            arr[depth]=i;
            if(Possibility(depth)){
                nQueen(depth+1);
            }
        }
    }public static boolean Possibility(int col){
        for(int i=0; i<col; i++){
            if(arr[col]==arr[i]){
                return false;
            }else if(Math.abs(col-i)==Math.abs(arr[col]-arr[i])){
                return false;
            }
        }return true;
    }
}
