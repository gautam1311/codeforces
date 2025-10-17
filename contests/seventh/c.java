package contests.seventh;

import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            if (a == b) {
                System.out.println(0);
                continue;
            }

            long diff = a ^ b;
            if (diff <= a) {
                System.out.println(1);
                System.out.println(diff);
                continue;
            }

            long msbA = Long.highestOneBit(a);
            long msbB = Long.highestOneBit(b);

            if (msbB > msbA) {
                System.out.println(-1);
                continue;
            }
            long firstMove = msbB;
            long afterFirst = a ^ firstMove;
            long secondMove = afterFirst ^ b;

            System.out.println(2);
            System.out.println(firstMove + " " + secondMove);
        }
        sc.close();
    }
}
