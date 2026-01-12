package contests.nine;

import java.util.*;

public class EasyGridPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] top = new int[n];
            int[] bottom = new int[n];

            for (int i = 0; i < n; i++) top[i] = sc.nextInt();
            for (int i = 0; i < n; i++) bottom[i] = sc.nextInt();

            long ans = 0;

            // For each possible "switch column" k
            for (int k = 0; k < n; k++) {
                int minVal = Integer.MAX_VALUE;
                int maxVal = Integer.MIN_VALUE;

                // top[0..k]
                for (int i = 0; i <= k; i++) {
                    minVal = Math.min(minVal, top[i]);
                    maxVal = Math.max(maxVal, top[i]);
                }

                // bottom[k..n-1]
                for (int i = k; i < n; i++) {
                    minVal = Math.min(minVal, bottom[i]);
                    maxVal = Math.max(maxVal, bottom[i]);
                }

                // Now all (l, r) that include [minVal, maxVal] work for this k
                // l can be any number from 1..minVal
                // r can be any number from maxVal..2n
                ans += (long) minVal * (2L * n - maxVal + 1);
            }

            System.out.println(ans);
        }
        sc.close();
    }
}

