//어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 
import java.util.*;
public class HanNumber_1065 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); //자연수n 지
       System.out.print(HanNumber(n));
    }
   public static int HanNumber(int n){//한수 메서드
        int count = 0;//개수저장
        for(int i =1; i<=n; i++){
            if(i<100){
                count++;//100미만조건없이더함
            } else if(i<1000){
                int i1 = i%10;
                int i2 = (i/10)%10;
                int i3 = (i/100)%10;
//각자리수더해서저
                if(i1-i2 == i2-i3){
                    count++;//등차수열인경우더함
                }
            }
        } return count;
   }
}
