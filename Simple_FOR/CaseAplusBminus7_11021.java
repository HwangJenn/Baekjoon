//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오
import java.util.*;
public class CaseAplusBminus7_11021 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i=0; i<t; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println("Case#"+ (i+1)+ " : " + a+b);
        }
    }
}
