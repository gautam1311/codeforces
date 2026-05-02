package contests.twelvee;

import java.util.Scanner;

public class d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int n = sc.nextInt();
            int ops = sc.nextInt();
            long limit = sc.nextLong();

            long[] base = new long[n + 1];
            for (int i = 1; i <= n; i++) {
                base[i] = sc.nextLong();
            }

            long[] delta = new long[n + 1];
            int[] ver = new int[n + 1];

            int currVer = 0;

            for (int i = 0; i < ops; i++) {
                int idx = sc.nextInt();
                long inc = sc.nextLong();

                if (ver[idx] != currVer) {
                    ver[idx] = currVer;
                    delta[idx] = 0;
                }

                delta[idx] += inc;

                if (base[idx] + delta[idx] > limit) {
                    currVer++;
                }
            }

            StringBuilder res = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                long val;
                if (ver[i] == currVer) {
                    val = base[i] + delta[i];
                } else {
                    val = base[i];
                }
                res.append(val);
                if (i < n) res.append(' ');
            }

            System.out.println(res.toString());
        }
    }
}
