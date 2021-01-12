//알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
import java.util.*;
public class word_1157 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.next().toUpperCase(); //대문자로 전환
        int[] count = new int[26];//알파벳은 26개
        for(int i=0; i<str.length(); i++){
            int num = str.charAt(i)-'A';//문자 세기
            count[num]++;
        } int max =0;//가장 많이 사용한 알파벳은?
        char answer = '?';//여러개면 ?출력
        for(int i=0; i<count.length; i++){
            if(max>count[i]){
                max = count [i];
                answer = (char)(i+'A');
            } else if (max == count[i]){
                answer = '?';
            }
        }System.out.println(answer);
    }
}
