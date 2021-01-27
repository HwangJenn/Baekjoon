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
