//N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
import java.util.*;
public class MinMax_10818 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); //배열선언
        int[] arr = new int[n]; //배열생성
        int max= -1000000; //정수 범위 지정. 모든 정수는 -1000000보다 크거나 같고
        int min= 1000000; // 1000000보다 작거나 같다

        for(int i=0; i<arr.length;i++){ //변수i값 초기화, 배열길이 변경
            arr[i]= scan.nextInt(); //배열주어짐
            if(arr[i]>max){ //최대최소
                max = arr[i];
            }else if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(max +" "+ min );
    }
}