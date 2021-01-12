//그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
//
//단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
import java.util.*;
public class checker_1316 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(); //단어개수입력
        String[] words = new String[N];//n개의 문자열 입력
        int WordsCount = 0;//단어의개수카운트

        for (int i = 0; i < N; i++) {
            words[i] = scan.next();
        }
        for (int i = 0; i < N; i++) {
            int[] group = new int[26];//알파벳개수지정
            boolean groupcheck = true;//체커선언
            for (int j = 0; j < words[i].length(); j++) {//길이만큼반복
                if (group[(int) words[i].charAt(j) - 97] > 0) {//현재문자가 이전에 나왔는지
                    groupcheck = false;
                    break;
                }
                int count = 1;
                for (int k = 1 + j; k < words[i].length(); k++) {
                    if (words[i].charAt(j) != words[i].charAt(k)) {
                        group[(int) words[i].charAt(j) - 97] = count;
                        break;
                    }
                    j++;
                    count++;
                }
            }
            if (groupcheck) {
                WordsCount++;
            }
        }
        System.out.println(WordsCount);
    }
}
