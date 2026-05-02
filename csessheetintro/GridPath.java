package csessheetintro;
import java.util.Scanner;

public class GridPath {
    static String path;
    static int total=0;
    static int n=7;
    static boolean visi[][]=new boolean[n][n];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        path=sc.next();
        dfs(0,0,0);
        System.out.println(total);


    }
    public static void dfs(int x,int y, int step){
        if(step==n*n-1||(x==n-1 && y==0)){
            if(step==n*n-1 && x==n-1 && y==0){
                total++;
            }
            return;
        }

        if((!isSafe(x-1,y) || visi[x-1][y]) && (!isSafe(x+1,y) || visi[x+1][y])){
            if((isSafe(x,y-1) && !visi[x][y-1] && isSafe(x,y+1) && !visi[x][y+1])){
                return;
            }
        }

        if((!isSafe(x,y-1) || visi[x][y-1]) && (!isSafe(x,y+1) || visi[x][y+1])){
            if((isSafe(x-1,y) && !visi[x-1][y] && isSafe(x+1,y) && !visi[x+1][y])){
                return;
            }
        }

        visi[x][y]=true;
        char ch=path.charAt(step);

        if(ch=='?'||ch=='R'){
            if(isSafe(x,y+1) && !visi[x][y+1]){
                dfs(x,y+1,step+1);
            }
        }
        if(ch=='?'||ch=='L'){
            if(isSafe(x,y-1) && !visi[x][y-1]){
                dfs(x,y-1,step+1);
            }
        }
        if(ch=='?'||ch=='D'){
            if(isSafe(x+1,y) && !visi[x+1][y]){
                dfs(x+1,y,step+1);
            }
        }
        if(ch=='?'||ch=='U'){
            if(isSafe(x-1,y) && !visi[x-1][y]){
                dfs(x-1,y,step+1);
            }
        }
        visi[x][y]=false;
    }
    public static boolean isSafe(int x, int y){
        return (x>=0 && x<n && y>=0 && y<n);
    }
}
