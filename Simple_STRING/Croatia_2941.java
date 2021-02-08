//예전에는 운영체제에서 크로아티아 알파벳을 입력할 수가 없었다. 따라서, 다음과 같이 크로아티아 알파벳을 변경해서 입력했다.
//예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
//
//dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다.
import java.util.*;
public class Croatia_2941 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};//크로아티아알파벳 변경
        String word = scan.nextLine();//단어 입력
        for(int i=0; i<8; i++){
            word = word.replace(croatia[i], "a");//단어 재배치
        }System.out.println(word.length());//수정후 크로아티아 알파벳 개수 출력
    }
}