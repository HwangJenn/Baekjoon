//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
import java.util.*;
public class AplusB_10951 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a;
        int b;
        while(scan.hasNextInt()){ 
            System.out.println(scan.nextInt()+ scan.nextInt()); 
        }
    }
}
