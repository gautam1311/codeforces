import java.util.*;

public class ChessboardandQueens{
    static char board[][]=new char[8][8];
    static boolean cols[]=new boolean[8];
    static boolean diag1[]=new boolean[15];
    static boolean diag2[]=new boolean[15];
    static int count=0;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<8;i++){
            board[i]=sc.next().toCharArray();
        }
        solve(0);
        System.out.println(count);
        sc.close();
    }
    public static void solve(int row){
        if(row==8){
            count++;
            return;
        }
        for(int col=0;col<8;col++){
            if(board[row][col]=='*'){
                continue;
            }
            if(cols[col]||diag1[row+col]||diag2[row-col+7]){
                continue;
            }
            cols[col]=diag1[row+col]=diag2[row-col+7]=true;
            solve(row+1);
            cols[col]=diag1[row+col]=diag2[row-col+7]=false;
        }
    }
}
