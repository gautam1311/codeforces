package contests.eleven;
import java.util.Scanner;

public class c {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();

            if (n == k) {
                System.out.println(0);
                continue;
            }

            int answer = -1;
            long div = 1;

            for (int moves = 1; moves <= 32; moves++) {
                div <<= 1;   // div = 2^moves

                long low = n / div;
                long high = (n + div - 1) / div; 

                if (k >= low && k <= high) {
                    answer = moves;
                    break;
                }

                if (high < k) {
                    break;
                }
            }

            System.out.println(answer);
        }

        sc.close();
    }
}
