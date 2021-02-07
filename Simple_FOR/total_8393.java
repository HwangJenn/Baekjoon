//n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
import java.util.*;
public class total_8393 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;

        for(int i=0; i<n;i++){
            sum+=(i+1);
        }
        System.out.println(sum);
    }
}
