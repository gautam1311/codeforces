import java.util.Scanner;

public class wierdSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();  // Use long to prevent overflow
        sc.close();

        StringBuilder result = new StringBuilder();

        while (true) {
            result.append(n).append(" ");
            if (n == 1) break;

            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }
        }

        System.out.println(result.toString().trim());
    }
}
