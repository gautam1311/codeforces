package contests.eleven;

import java.util.Scanner;

public class b {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long s = sc.nextLong();
            long k = sc.nextLong();
            long m = sc.nextLong();

            if (s <= k) {
                long elap = m % k;
                long rem = s - elap;
                if (rem < 0){
                    rem=0;
                }
                System.out.println(rem);
            } else {
                long blocks = m / k;
                long elap = m % k;

                long start;
                if (blocks % 2 == 0) {
                    start = s;
                } else {
                    start = k;
                }

                long rem = start - elap;
                if (rem < 0) {
                    rem = 0;
                }
                System.out.println(rem);
            }
        }
        sc.close();
    }
}
