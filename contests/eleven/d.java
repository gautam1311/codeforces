package contests.eleven;

import java.util.Scanner;

public class d {
    static long[][] comb = new long[61][61];

    // build combination table up to 60
    static void buildComb() {
        for (int i = 0; i <= 60; i++) {
            comb[i][0] = 1;
            for (int j = 1; j <= i; j++) {
                comb[i][j] = comb[i - 1][j - 1] + comb[i - 1][j];
            }
        }
    }

    public static void main(String[] args) {
        buildComb();

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();

            int maxBit = 63 - Long.numberOfLeadingZeros(n);

            long bob = 0;

            // case when starting number is n itself
            if (maxBit + 1 > k) {
                bob = 1;
            }

            for (int length = 0; length < maxBit; length++) {
                for (int ones = 0; ones <= length; ones++) {
                    long moves = length + ones + 1;
                    if (moves > k) {
                        bob += comb[length][ones];
                    }
                }
            }

            System.out.println(bob);
        }

        sc.close();
    }
}
