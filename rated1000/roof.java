package rated1000;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class roof{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            n--; // The problem logic operates on the range 0 to n-1

            // Handle edge cases where the original n was 0 or 1
            if (n < 0) {
                System.out.println(); // Empty line for n=0
                continue;
            }
            if (n == 0) {
                System.out.println(0); // Just "0" for n=1
                continue;
            }

            // In Java, log2(n) can be found by (long)(Math.log(n) / Math.log(2))
            // This finds the position of the most significant bit (MSB).
            long msb = (long) (Math.log(n) / Math.log(2));

            // ArrayList is the Java equivalent of std::vector
            List<Long> ans = new ArrayList<>();

            // First loop: add numbers from (2^msb - 1) down to 0
            // (1L << msb) is an efficient way to calculate 2^msb
            long num = (1L << msb) - 1;
            while (num >= 0) {
                ans.add(num);
                num--;
            }

            // Second loop: add numbers from 2^msb up to n
            num = (1L << msb);
            while (num <= n) {
                ans.add(num);
                num++;
            }

            // Use a StringBuilder for efficient string concatenation
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < ans.size(); i++) {
                sb.append(ans.get(i));
                // Add a space after each number except the last one
                if (i < ans.size() - 1) {
                    sb.append(" ");
                }
            }
            System.out.println(sb.toString());
        }
        // Close the scanner to free up resources
        sc.close();
    }
}
