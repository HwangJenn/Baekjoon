//N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
public class num2_2751 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scan.nextInt());
        }
        Collections.sort(list);
        for (int val : list){
            sb.append(val).append('\n');
        } System.out.println(sb);
    }
}
