//세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.
import java.util.*;
public class point_3009 {
    public  static  void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        int x3 = scan.nextInt();
        int y3 = scan.nextInt();
        int x = x1;
        int y = y1;

        if(x1==x2){
            x= x3;
        }if(x1==x3){
            x=x2;
        }if(y1==y2){
            y=y3;
        }if(y1==y3){
            y=y2;
        }System.out.println(x+" "+y);
    }
}
