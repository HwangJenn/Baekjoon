//이와 같이 나열된 분수들을 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> … 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
//
//X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.
import java.util.*;
public class fractional_1193 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();
        int cross_count =1; //대각선 개
        int pre_count_sum=0;//누적 합
        while(true){
            if(X<=cross_count+pre_count_sum){//범위판별
                if(cross_count%2==1){//홀수
                    System.out.print((cross_count-(X-pre_count_sum-1))+"/"+(X-pre_count_sum));
                    break;
                } else {//짝수
                    System.out.print((X - pre_count_sum) + "/" + (cross_count - (X - pre_count_sum - 1)));
                    break;
                }
                }else{
                    pre_count_sum+=cross_count;
                    cross_count++;
                }
            }
        }
    }

