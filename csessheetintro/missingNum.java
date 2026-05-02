package csessheetintro;

import java.util.Scanner;

public class missingNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long totalSum = (long) n * (n + 1) / 2;  // Use long to avoid overflow

        long sum = 0;
        for (int i = 0; i < n - 1; i++) {
            sum += sc.nextInt();  // Accumulate in long
        }
        sc.close();

        long missingNumber = totalSum - sum;
        System.out.println(missingNumber);
    }
}
