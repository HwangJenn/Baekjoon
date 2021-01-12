//영어 대소문자와 띄어쓰기만으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오. 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
import java.util.*;
public class CountWords_1152 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String words = scan.nextLine();//문자열 생성
        String[] arr = words.split(" ");//글자 쪼개기

        if(arr.length>0){
            if("".equals(arr[0]))//공백포함안하기
                System.out.println(arr.length-1);
            else System.out.println(arr.length);
        } else {
            System.out.println("0");
        }
    }
}
