//19세기 독일 수학자 헤르만 민코프스키는 비유클리드 기하학 중 택시 기하학을 고안했다.
//
//택시 기하학에서 두 점 T1(x1,y1), T2(x2,y2) 사이의 거리는 다음과 같이 구할 수 있다.
//
//D(T1,T2) = |x1-x2| + |y1-y2|
//
//두 점 사이의 거리를 제외한 나머지 정의는 유클리드 기하학에서의 정의와 같다.
//
//따라서 택시 기하학에서 원의 정의는 유클리드 기하학에서 원의 정의와 같다.
//
//원: 평면 상의 어떤 점에서 거리가 일정한 점들의 집합
//
//반지름 R이 주어졌을 때, 유클리드 기하학에서 원의 넓이와, 택시 기하학에서 원의 넓이를 구하는 프로그램을 작성하시오.
import java.io.*;
import java.util.*;
public class nonEuclideanGeometry_3053 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int R = Integer.parseInt(br.readLine());
        System.out.printf("%.6f\n",(double)R*R*3.14);
        System.out.printf("%.6f\n",(double)2*R*R);
    }
}
