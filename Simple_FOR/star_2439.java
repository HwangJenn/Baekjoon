import java.util.*;
public class star_2439 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); //찍을별층수
        for (int i = 0; i < n; i++) { //반복
            for (int j = 0; j < n - i - 1; j++) { //가로 반대로
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {//세로는 그대로
                System.out.print("*");
            }
            System.out.println();
        }
    }
}