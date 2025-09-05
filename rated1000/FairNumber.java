package rated1000;

import java.util.Scanner;

public class FairNumber {

    static boolean isFair(long n) {
        long num = n;
        while (num != 0) {
            int x = (int)(num % 10);
            if (x != 0 && n % x != 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong(); // must be long
            while (!isFair(n)) {
                n++;
            }
            System.out.println(n);
        }

        sc.close();
    }
}
