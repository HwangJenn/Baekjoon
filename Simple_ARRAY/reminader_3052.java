//두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다.
//
//수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
import java.util.*;
public class reminader_3052 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[10]; //길이10인 배열생성
        int count = 0;//길이초기화
        int counts[] = new int[42];//42로 나눈 배열구하기
        for(int i=0; i<arr.length;i++){//배열길이초기화
            arr[i]= scan.nextInt();//배열입력
        }
        for(int i=0; i<arr.length;i++){
            counts[arr[i]%42]++;//42로나눈배열구하기
        }
        for(int i=0; i<counts.length; i++){//배열하기
            if(counts[i] !=0){//0과 다르면 true아니면 false
                count++;
            }
        }System.out.println(count);
    }
}
