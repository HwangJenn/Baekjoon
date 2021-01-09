//각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
import java.util.*;
public class college_4344 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int c = scan.nextInt();
        int n, total, count;
        double avg;
        int score[] = new int[1000];//배열생성,길이

        for(int i=0; i<c; i++){//케이스입력
            n = scan.nextInt();
            total =0;
            count =0;
            for (int j=0; j<n; j++){//점수입력
                score[j] = scan.nextInt();
                total += score[j];
            }
            avg = (double)total/n;//평균출력
            for(int j=0; j<n; j++){
                if(score[j]> avg){
                    count++;//줄세우기
                }
            } System.out.printf("%.3f",100.0*count/n);
            System.out.print("%");
        }
    }
}
