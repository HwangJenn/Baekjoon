//알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
import java.util.*;
public class findAlphabet_10809 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int count  = 0; //단어의 길이
        int[] ascii = new int[26]; //알파벳을 26개 아스키코드 이용
        for(int i=0; i<26; i++){
            ascii[i] =-1; //알파벳이 단어에 포함되지 않은경우 -1출력
        } String a = scan.nextLine();//문자열생
        for(int i=0; i<a.length(); i++){
            char ch = a.charAt(i);//입력받은 문자
            int ch2 = (int)ch;
            int ch3 = ch2-97;
            if(ascii[ch3]==-1){//포함안하면 -1
                ascii[ch3]=count++;
            } else{
                count = count+1;//하면1
            }
        } for(int i=0; i<26; i++){
            System.out.print(ascii[i]);
            System.out.print(" ");
        }
    }
}
