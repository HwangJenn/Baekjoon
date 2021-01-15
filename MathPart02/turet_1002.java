//이석원은 조규현과 백승환에게 상대편 마린(류재명)의 위치를 계산하라는 명령을 내렸다. 조규현과 백승환은 각각 자신의 터렛 위치에서 현재 적까지의 거리를 계산했다.
//
//조규현의 좌표 (x1, y1)와 백승환의 좌표 (x2, y2)가 주어지고, 조규현이 계산한 류재명과의 거리 r1과 백승환이 계산한 류재명과의 거리 r2가 주어졌을 때, 류재명이 있을 수 있는 좌표의 수를 출력하는 프로그램을 작성하시오.
import java.util.*;
public class turet_1002 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0; t<T; t++) {
            int x[] = new int[3];
            int y[] = new int[3];
            int r[] = new int[3];
            for (int i = 1; i <= 2; i++) {
                x[i] = sc.nextInt();
                y[i] = sc.nextInt();
                r[i] = sc.nextInt();
            }
            double dotDistance = Math.sqrt(Math.pow(x[1] - x[2], 2) + Math.pow(y[1] - y[2], 2));
            int circleSum = r[1] + r[2];
            int circleSub = Math.abs(r[1] - r[2]);
            if (dotDistance == 0 && circleSub == 0) {
                System.out.println(-1);
            } else if (dotDistance < circleSub || dotDistance > circleSum) {
                System.out.println(0);
            } else if (dotDistance == circleSub || dotDistance == circleSum) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }
    }
}
