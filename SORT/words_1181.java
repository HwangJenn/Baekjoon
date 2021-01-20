//알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.
//길이가 짧은 것부터
//길이가 같으면 사전 순으로
import java.util.*;
import java.util.Arrays;
import java.util.Comparator;
public class words_1181 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] arr = new String[n];
        scan.nextLine();
        for(int i=0; i<n; i++){
            arr[i] = scan.nextLine();
        }Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else {
                    return o1.length() - o2.length();
                }
            }
        }); System.out.println(arr[0]);
        for(int i=1; i<n; i++){
            if(!arr[i].equals(arr[i-1])){
                System.out.println(arr[i]);
            }
        }
    }
}
