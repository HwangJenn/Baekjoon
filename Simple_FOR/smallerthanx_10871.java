//정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
import java.util.*;
public class smallerthanx_10871 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); //정수 개수
        int x = scan.nextInt(); //정수
        int[] a = new int[n]; //수열(배열)
        for(int i=0; i<n;i++){
            a[i]= scan.nextInt();
        }
        for(int i=0; i<n; i++){
            if(a[i]<x) System.out.print(a[i]+" ");
        }
    }
}
