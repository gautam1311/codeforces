package contests.twelvee;

import java.util.*;

public class e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();

            long[] a = new long[n];
            long[] b = new long[m];

            for (int i = 0; i < n; i++) a[i] = sc.nextLong();
            for (int i = 0; i < m; i++) b[i] = sc.nextLong();

            Arrays.sort(b);

            String s = sc.next();

            long[] D = new long[k + 1];
            long minD = 0, maxD = 0;
            for (int i = 1; i <= k; i++) {
                D[i] = D[i - 1] + (s.charAt(i - 1) == 'R' ? 1 : -1);
                minD = Math.min(minD, D[i]);
                maxD = Math.max(maxD, D[i]);
            }

            HashMap<Long, Integer> fTime = new HashMap<>();
            for (int i = 1; i <= k; i++) {
                fTime.putIfAbsent(D[i], i);
            }

            int[] deadAt = new int[k + 2];

            for (int i = 0; i < n; i++) {
                long left = a[i] + minD;
                long right = a[i] + maxD;

                int L = lowerBound(b, left);
                int R = upperBound(b, right);

                int death = Integer.MAX_VALUE;

                for (int j = L; j < R; j++) {
                    long need = b[j] - a[i];
                    Integer tHit = fTime.get(need);
                    if (tHit != null) {
                        death = Math.min(death, tHit);
                    }
                }

                if (death != Integer.MAX_VALUE) {
                    deadAt[death]++;
                }
            }

            int alive = n;
            StringBuilder out = new StringBuilder();
            for (int i = 1; i <= k; i++) {
                alive -= deadAt[i];
                out.append(alive).append(' ');
            }
            System.out.println(out);
        }
    }

    static int lowerBound(long[] arr, long x) {
        int l = 0, r = arr.length;
        while (l < r) {
            int mid = (l + r) >>> 1;
            if (arr[mid] < x) l = mid + 1;
            else r = mid;
        }
        return l;
    }

    static int upperBound(long[] arr, long x) {
        int l = 0, r = arr.length;
        while (l < r) {
            int mid = (l + r) >>> 1;
            if (arr[mid] <= x) l = mid + 1;
            else r = mid;
        }
        return l;
    }
}
