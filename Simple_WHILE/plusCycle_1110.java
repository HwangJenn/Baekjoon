import java.util.*;
public class plusCycle_1110 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); //첫째줄 n

        int num = n; //숫자 입력받을 n으로 초기화
        int count = 0; //길이 0으로 초기화

        do {//입력n에 관한 결과값을 얻기위해 수행할 블럭
            num = num %10 *10+ (num/10 +num%10) %10;// 각자리수더하기+일의자리붙이
            count++; //위 문장이 실행될수록 하나씩 늘어나는 길이
        }while (n!=num); //입력값과 위 블럭의 숫자가 같을때 블럭 빠져나옴
        System.out.println((count)); //길이 출력
    }
}
