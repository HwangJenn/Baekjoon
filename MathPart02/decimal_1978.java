//주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
import java.util.*;
public class decimal_1978 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int count = 0;
        int result =0;

        for(int i=0; i<N; i++){
            int number = scan.nextInt();
            for(int j=0; j<1000; j++){
                if(j!=0&&j!=1&&number!=j&&number%j==0){
                    count =1;
                }if(number<j){
                    if(count==0&&number!=0&&number!=1){
                        result++;
                    } break;
                }
            }count =0;
        }System.out.println(result);
    }
}
