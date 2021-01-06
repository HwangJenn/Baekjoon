import java.util.*;
public class alarm_2884 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int H = scan.nextInt();
        int M = scan.nextInt();
        if(M<45){ //45분 전 알람
            M+=60; // 분범위
            H--; // 앞당기기 때문
            if(H<0) H=23; //시 단위
        }
        System.out.println(H+" "+(M-45)); //알람시간표시
    }
}
