//정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.
import java.util.*;
public class PrimeFactorization_11653 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int i = 2;
        while(N>=i){
            if(N%i==0){
                System.out.println(i);
                N/=i;
            }else {
                i++;
            }
        }

    }
}
