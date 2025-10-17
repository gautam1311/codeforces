import java.util.*;

public class b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int total = n * n;
            int m = total - k; 

            if (m == 1) {
                System.out.println("NO");
                continue;
            }

            System.out.println("YES");
            char[][] grid = new char[n][n];

            for (int i = 0; i < n; i++) Arrays.fill(grid[i], 'R');

            if (n == 2 && m == 3) {
                grid[0][0] = 'U'; grid[0][1] = 'D';
                grid[1][0] = 'R'; grid[1][1] = 'L';
            } else {
                int trapped = 0;
                int col = 0;

                while (trapped < m) {
                    int size = Math.min(n, m - trapped);

                    if (m - trapped == 1) size--;

                    for (int i = 0; i < size - 1; i++) {
                        grid[i][col] = 'D';
                    }
                    if (size >= 2) {
                        grid[size - 1][col] = 'U';
                    }
                    trapped += size;
                    col++;
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(grid[i][j]);
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
