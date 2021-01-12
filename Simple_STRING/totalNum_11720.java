//N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
import java.util.*;
public class totalNum_11720 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();//숫자개수입력
        String str = scan.next();//문자열로
        int sum = 0;
        for(int i=0; i<N; i++){
            sum += str.charAt(i)-'0';//아스키코드 출력 안하기 위함
        }System.out.print(sum);
    }
}
