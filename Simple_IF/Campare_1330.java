//두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
import java.util.*;
public class Campare_1330 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        if(a>b) System.out.println(">");
        if(a<b) System.out.println("<");
        if(a==b) System.out.println("==");
    }
}
