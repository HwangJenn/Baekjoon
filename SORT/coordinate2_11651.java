//2차원 평면 위의 점 N개가 주어진다. 좌표를 y좌표가 증가하는 순으로, y좌표가 같으면 x좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.
import java.util.*;
import java.util.Arrays;
public class coordinate2_11651 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][2];
        for(int i=0; i<n; i++){
            arr[i][1] = scan.nextInt();
            arr[i][0] = scan.nextInt();
        }Arrays.sort(arr, (a,b)-> {
            if(a[0] == b[0]){
                return a[1]-b[1];
            }else {
                return a[0]-b[0];
            }
        }); for(int i=0; i<n; i++){
            System.out.println(arr[i][1]+ " "+arr[i][0]);
        }
    }
}
