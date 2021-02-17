//(A+B)%C는 ((A%C) + (B%C))%C 와 같을까?

//(A×B)%C는 ((A%C) × (B%C))%C 와 같을까?

//세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
import java.util.*;
public class remainder {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.println((a+b)%c);
        System.out.println(((a%c)+(b%c))%c);
        System.out.println((a*b)%c);
        System.out.println((a%c)*(b%c)%c);
    }
}
