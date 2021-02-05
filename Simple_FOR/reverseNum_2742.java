//자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
import java.util.*;
public class reverseNum_2742 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=n; i>0; i--){
            System.out.println(i);
        }
    }
}
