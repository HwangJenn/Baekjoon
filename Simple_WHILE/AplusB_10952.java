//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
import java.util.*;
public class AplusB_10952 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(true){
            int a = scan.nextInt();
            int b = scan.nextInt();
            if(a==0 && b==0) break;
            System.out.println(a+b);
        }
    }
}
