//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.//큰수
import java.math.*;
import java.util.*;
public class AplusB_10757 {
    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        BigInteger A = scan.nextBigInteger();
        BigInteger B = scan.nextBigInteger();
        System.out.println(A.add(B));
    }
}
