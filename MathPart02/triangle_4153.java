//과거 이집트인들은 각 변들의 길이가 3, 4, 5인 삼각형이 직각 삼각형인것을 알아냈다. 주어진 세변의 길이로 삼각형이 직각인지 아닌지 구분하시오.
import java.util.*;
public class triangle_4153 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(true){
            int[] n = new int[3];
            for(int i=0; i<n.length; i++){n[i]= scan.nextInt();}
            if(n[0]+n[1]+n[2]==0){
                break;
            }else{
                Arrays.sort(n);
                if(Math.pow(n[0],2)+Math.pow(n[1],2)==Math.pow(n[2],2)){
                    System.out.println("right");
                }else {
                    System.out.println("wrong");
                }
            }
        }
    }
}
