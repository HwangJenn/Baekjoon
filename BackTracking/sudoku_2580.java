//게임 시작 전 스도쿠 판에 쓰여 있는 숫자들의 정보가 주어질 때 모든 빈 칸이 채워진 최종 모습을 출력하는 프로그램을 작성하시오.
import java.util.*;
public class sudoku_2580 {
    public static int[][] arr = new int[9][9];
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                arr[i][j]= scan.nextInt();
            }
        }sudoku(0,0);
    }public static void sudoku(int row, int col){
        if(col==9){
            sudoku(row +1,0);
            return;
        }if(row == 9){
            for(int i=0; i<9; i++){
                for(int j=0; j<9; j++){
                    System.out.print(arr[i][j]+ " ");
                }System.out.println();
            }System.exit(0);
        }if(arr[row][col]==0){
            for(int i=1; i<=9; i++){
                if(Possibility(row,col,i)){
                    arr[row][col]=i;
                    sudoku(row,col+1);
                }
            }arr[row][col]=0;
            return;
        }sudoku(row, col+1);
    }public static boolean Possibility(int row, int col, int value){
        for(int i=0; i<9; i++){
            if(arr[row][i]==value){
                return false;
            }
        }for(int i=0; i<9; i++){
            if(arr[i][col]==value){
                return false;
            }
        }int set_row = (row/3)*3;
        int set_col = (col/3)*3;
        for(int i=set_row;i<set_row+3;i++){
            for(int j=set_col; j<set_col+3;j++){
                if(arr[i][j]==value){
                    return false;
                }
            }
        }return true;
    }
}
