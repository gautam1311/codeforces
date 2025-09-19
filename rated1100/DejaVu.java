package rated1100;
import java.util.*;

public class DejaVu{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // number of test cases
        while (t-- > 0) {
            long n = sc.nextLong();
            long q = sc.nextLong();

            long[] a = new long[(int) n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            long[] x = new long[(int) q];
            for (int i = 0; i < q; i++) {
                x[i] = sc.nextLong();
            }

            long prev = 31;
            for (int i = 0; i < q; i++) {
                if (x[i] >= prev) continue;

                long val = 1L << x[i]; // equivalent of pow(2, x[i])
                for (int j = 0; j < n; j++) {
                    if (a[j] % val == 0) {
                        a[j] += (val / 2);
                    }
                }
                prev = x[i];
            }

            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
