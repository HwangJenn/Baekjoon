//자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.
import java.util.*;
public class decimal_2581 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int count = 0;
        int sum = 0;
        int min = 0;

        for (int i=m; i<=n; i++) {
            int j;
            for (j=2; j*j<=i; j++)
                if (i % j == 0)
                    break;
            if ((j*j > i)&&(i != 1)) {
                sum += i;
                if (count == 0)
                    min = i;
                count++;
            }
        }

        if (count == 0)
            System.out.println(-1);
        else {
            System.out.println(sum);
            System.out.println(min);
        }
}
}