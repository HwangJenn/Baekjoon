//OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오
import java.util.*;
public class quiz_8958 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] cases = new String[n]; //문자열 가지는 string 메서드 생성
        for(int i=0; i<n; i++){//케이스 개수
            cases[i] = scan.next();
        }
        int count;//케이스길이
        int total;//점수
        for(String result : cases){//string에 의한 케이스
            count=0;//길이 초기화
            total=0;//점수 초기
            for(int i =0; i< result.length(); ++i){
                if(result.charAt(i) == 'O'){//맞은거 계산
                    total += ++count;
                }else{
                    count =0;//x는 점수 없음
                }
            } System.out.println(total);
        }
    }
}
