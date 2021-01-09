//9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오
import java.util.*;
public class Max_2562 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[9]; //배열선언
        int max =0; //최대값 초기화
        int count =0; //길이 초기화

        for(int i=0; i<9; i++){//배열값초기화
            arr[i] = scan.nextInt();//배열입력
            if(arr[i]>max){//최대값구하기
                max=arr[i];
                count=i+1;//길이구하기
            }
        }
        System.out.println(max);
        System.out.println(count);
    }
}
