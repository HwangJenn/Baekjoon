//1보다 큰 자연수 중에서  1과 자기 자신을 제외한 약수가 없는 자연수를 소수라고 한다. 예를 들어, 5는 1과 5를 제외한 약수가 없기 때문에 소수이다. 하지만, 6은 6 = 2 × 3 이기 때문에 소수가 아니다.
//
//골드바흐의 추측은 유명한 정수론의 미해결 문제로, 2보다 큰 모든 짝수는 두 소수의 합으로 나타낼 수 있다는 것이다. 이러한 수를 골드바흐 수라고 한다. 또, 짝수를 두 소수의 합으로 나타내는 표현을 그 수의 골드바흐 파티션이라고 한다. 예를 들면, 4 = 2 + 2, 6 = 3 + 3, 8 = 3 + 5, 10 = 5 + 5, 12 = 5 + 7, 14 = 3 + 11, 14 = 7 + 7이다. 10000보다 작거나 같은 모든 짝수 n에 대한 골드바흐 파티션은 존재한다.
//
//2보다 큰 짝수 n이 주어졌을 때, n의 골드바흐 파티션을 출력하는 프로그램을 작성하시오. 만약 가능한 n의 골드바흐 파티션이 여러 가지인 경우에는 두 소수의 차이가 가장 작은 것을 출력한다.
import java.util.*;
public class goldBach_9020 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t=0, n=0, cnt=0;

        t = s.nextInt();

        int[] arr = new int[t];
        for(int i=0;i<t;i++) {
            n = s.nextInt();

            if(4>n || n>10000 || n%2!=0) {
                System.out.println("4 <= n <= 10,000 (n is even)");
                i--;
            }
            else arr[i] = n;
        }

        int[][] result = new int[t][2];
        for(int i=0;i<t;i++) {
            int[] arr2 = new int[arr[i]];
            for(int j=2;j<=arr[i];j++) {
                boolean isPrime = true;

                for(int k=2;k*k<=j;k++) {
                    if(j%k==0) {
                        isPrime = false;
                        break;
                    }
                }

                if(isPrime) {
                    arr2[cnt] = j;
                    cnt++;
                }
            }

            for(int a=cnt-1;a>=0;a--) {
                if(arr2[a]*2 == arr[i]){
                    result[i][0] = arr2[a];
                    result[i][1] = arr2[a];
                    break;
                }
                else {
                    for(int b=a-1;b>=0;b--) {
                        if((arr2[a]+arr2[b]) == arr[i]) {
                            if(result[i][0] == 0 && result[i][1] == 0) {
                                result[i][0] = arr2[b];
                                result[i][1] = arr2[a];
                            }
                            else if(arr2[a]-arr2[b] < result[i][1]-result[i][0]){
                                result[i][0] = arr2[b];
                                result[i][1] = arr2[a];
                            }
                        }
                    }
                }
            }

            cnt=0;
        }

        for(int i=0;i<t;i++) {
            System.out.println(result[i][0] + " " + result[i][1]);
        }
    }
}
