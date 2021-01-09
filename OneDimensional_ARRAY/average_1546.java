//세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 일단 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
import java.util.*;
public class average_1546 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
//변수를 실수로 지정하므로써 int대신 double사용
        double max = 0;//최대값초기화
        double avg = 0;//평균값초기화
        double sum = 0;//합초기화

        double arr[];//배열선언
        arr = new double[n];//배열값지정
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();//배열값입력
        } for(int i=0; i< arr.length; i++) {//배열길이지정
            if (arr[i] > max)//최대값구하기
                max = arr[i];
        } for(int i=0; i< arr.length; i++){
            arr[i] = arr[i]/max*100;
            sum+= arr[i];//평균구하기
        } avg = sum/n;
        System.out.printf("%2f", avg);//소수점 2째자리까지 출력
    }
}
