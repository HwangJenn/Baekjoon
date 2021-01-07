import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Buffer_AplusB_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try{
            int t = Integer.parseInt(br.readLine());
            for(int i=0; i<t; i++){
                String text = br.readLine();
                String[] word = text.split(" ");
                int a = Integer.parseInt(word[0]); //첫번째 호출
                int b = Integer.parseInt(word[1]); //두번째 호
                bw.write((a+b)+ "\n"); //출
            }
            bw.flush(); //모든데이터 출력
            bw.close(); //스트림 닫기
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
