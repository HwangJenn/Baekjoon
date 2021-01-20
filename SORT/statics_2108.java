//수를 처리하는 것은 통계학에서 상당히 중요한 일이다. 통계학에서 N개의 수를 대표하는 기본 통계값에는 다음과 같은 것들이 있다. 단, N은 홀수라고 가정하자.
//
//산술평균 : N개의 수들의 합을 N으로 나눈 값
//중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
//최빈값 : N개의 수들 중 가장 많이 나타나는 값
//범위 : N개의 수들 중 최댓값과 최솟값의 차이
//N개의 수가 주어졌을 때, 네 가지 기본 통계값을 구하는 프로그램을 작성하시오.
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
public class statics_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int val = Integer.parseInt(br.readLine());
            arr[i] = val;
            sum += val;
        }
        Arrays.sort(arr);
        boolean flag = false;
        int mode_max = 0;
        int mode = 10000;
        for (int i = 0; i < n; i++) {
            int jump = 0;
            int count = 1;
            int i_val = arr[i];
            for (int j = i + 1; j < n; j++) {
                if (i_val != arr[j]) {
                    break;
                }
                count++;
                jump++;
            }
            if (count > mode_max) {
                mode_max = count;
                mode = i_val;
                flag = true;
            } else if (count == mode_max && flag == true) {
                mode = i_val;
                flag = false;
            }
            i += jump;
        } System.out.println((int)Math.round((double) sum/n));
        System.out.println(arr[((n+1)/2)-1]);
        System.out.println(mode);
        System.out.println(arr[n-1]-arr[0]);
    }
}

