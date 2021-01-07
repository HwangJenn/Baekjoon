import java.util.*;
public class MultiplicationTable_2739 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int m=1; m<10; m++){ //구구단 범위 지정
            System.out.println((n+ " * " +m+" = "+n*m));
        }
    }
}
