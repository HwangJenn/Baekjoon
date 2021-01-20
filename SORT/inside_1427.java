//배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.
import java.util.*;
public class inside_1427 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] count = new int[10];
        int n = scan.nextInt();
        while(n!=0){
            count[n%10]++;
            n/=10;
        }for(int i=9; i>=0; i--){
            while (count[i]-->0){
                System.out.print(i);
            }
        }
    }
}
