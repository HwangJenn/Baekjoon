//세 개의 자연수 A, B, C가 주어질 때 A×B×C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
import java.util.*;
public class countNumber_2577 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int[] count = new int[10]; //배열선언,길이가10인배열
        int n = a*b*c;//n입력받기
        while(n>0){
            count[n%10]++;//길이는 일의자리
            n/=10;//n=n/10
        }
        for(int i=0; i<count.length; i++){//길이계산
            System.out.println(count[i]);
        }
    }
}
