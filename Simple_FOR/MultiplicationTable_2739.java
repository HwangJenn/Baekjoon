//첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
//하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
import java.util.*;
public class MultiplicationTable_2739 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int m=1; m<10; m++){ //구구단 범위 지정
            System.out.println((n+ " * " +m+" = "+n*m));
        }
    }
}
