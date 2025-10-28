package contests.eight;

import java.util.*;

public class f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();    
        while (t-- > 0) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        long x = sc.nextLong();

        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        Arrays.sort(a);

        if (k >= x + 1) {
            for (int i = 0; i <= x; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }

        
        if (k == 1) {
            long mid = (a[0] + a[n - 1]) / 2;
            System.out.println(mid);
            return;
        }
        List<Long> list = new ArrayList<>();
        long pos = x / (k - 1);
        for (int i = 0; i < k; i++) {
            list.add(i * pos);
        }

        for (long p : list) {
            System.out.print(p + " ");
        }
        System.out.println();
    }
}

