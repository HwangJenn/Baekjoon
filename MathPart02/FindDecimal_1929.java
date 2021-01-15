//M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
import java.util.*;
public class FindDecimal_1929{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int M = scan.nextInt();
        int N = scan.nextInt();

        boolean[] arr = new boolean[N+1];
        for(int i=2; i<=N; i++){
            arr[i] = true;
        } for(int i=2; i*i<=N; i++){
            if(arr[i]){
                for(int j=i*i; j<=N; j+=i){
                    arr[j] = false;
                }
            }
        } for(int i=M+1; i<=N; i++){
            if(arr[i]){
                System.out.println(i);
            }
        }
    }
}
