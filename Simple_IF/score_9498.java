import java.util.*;
public class score_9498 {
    public static void main(String[] args) {
        int score = 0; // 점수 저장 위한 변수
        char grade = ' '; // 학점 저장 위한 변수->공백으로 초기화

        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
             grade = 'F';
        }
        System.out.println(grade);
    }
}
