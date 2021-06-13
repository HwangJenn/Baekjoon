//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
import java.util.*;
public class AplusBminus3_10950 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt(); // 테스트 케이스 입
        for(int i=0; i<t; i++){ // 변수 i값 0으로 초기화; t까지; 1씩증
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println(a+b);
        }
    }
}
