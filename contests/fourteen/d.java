package contests.fourteen;

import java.util.*;

public class d {

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[2 * n];

        int z1 = -1, z2 = -1;

        for (int i = 0; i < 2 * n; i++) {
            a[i] = sc.nextInt();
            if (a[i] == 0) {
                if (z1 == -1) {
                    z1 = i;
                }
                else {
                    z2 = i;
                }
            }
        }

        int ans = 0;

        int[] centers = {2 * z1, 2 * z2, z1 + z2};

        for (int c : centers) {
            int l = c / 2;
            int r = (c % 2 == 0) ? l : l + 1;

            while (l >= 0 && r < 2 * n && a[l] == a[r]) {
                l--;
                r++;
            }

            l++; r--;

            if (l <= r) {
                boolean[] seen = new boolean[n + 1];

                for (int i1 = l; i1 <= r; i1++) {
                    if (a[i1] <= n) seen[a[i1]] = true;
                }

                int mex = 0;
                while (mex <= n && seen[mex]) {
                    mex++;
                }

                ans = Math.max(ans, mex);
            }
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            solve(sc);
        } 
    }
}