package csessheetintro;

import java.util.*;

public class knightMoves {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=1;
        while(t-->0){
            solve(sc);
        }
        sc.close();
    }
    public static void solve(Scanner sc){
        int n=sc.nextInt();
        int grid[][]=new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(grid[i],-1);
        }
        bfs(grid,0,0);
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                sb.append(grid[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
    public static void bfs(int grid[][], int i, int j){
        int n=grid.length;
        Queue<int[]> queue = new ArrayDeque<>();

        queue.offer(new int[]{i,j});
        grid[i][j]=0;
        int dir[][]={{2,1},{-2,1},{2,-1},{-2,-1},{1,2},{1,-2},{-1,2},{-1,-2}};
        while(!queue.isEmpty()){
            int curr[]=queue.poll();
            int x=curr[0];
            int y=curr[1];
            for(int d[]:dir){
                int new_x=x+d[0];
                int new_y=y+d[1];
                if(isValid(new_x,new_y,n)&& grid[new_x][new_y]==-1){
                    grid[new_x][new_y]=grid[x][y]+1;
                    queue.offer(new int[]{new_x,new_y});
                }
            }
        }
    }
    public static boolean isValid(int x, int y,int n){
        return x>=0 && x<n && y>=0 && y<n;
    }
}
