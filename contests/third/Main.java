import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        StringBuilder output = new StringBuilder();
        while (t-- > 0) {
            solve(reader, output);
        }
        System.out.print(output.toString());
    }

    public static void solve(BufferedReader reader, StringBuilder output) throws IOException {
        int n = Integer.parseInt(reader.readLine());
        long[] a = new long[n];
        StringTokenizer st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Long.parseLong(st.nextToken());
        }

        long totalCost = 0;

        // Part 1: Calculate cost for reducing ODD numbers
        long oddSum = 0;
        long evenSum = 0;
        long maxEvenPrefix = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) { // 1-based ODD index
                oddSum += a[i];
            } else { // 1-based EVEN index
                evenSum += a[i];
            }
            maxEvenPrefix = Math.max(maxEvenPrefix, evenSum);
            long requiredReduction = Math.max(0, oddSum - maxEvenPrefix);
            totalCost += requiredReduction;
            oddSum -= requiredReduction; // Apply the reduction conceptually
        }

        // Part 2: Calculate cost for reducing EVEN numbers
        oddSum = 0;
        evenSum = 0;
        long maxOddSuffix = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (i % 2 != 0) { // 1-based EVEN index
                evenSum += a[i];
            } else { // 1-based ODD index
                oddSum += a[i];
            }
            maxOddSuffix = Math.max(maxOddSuffix, oddSum);
            long requiredReduction = Math.max(0, evenSum - maxOddSuffix);
            totalCost += requiredReduction;
            evenSum -= requiredReduction; // Apply the reduction conceptually
        }
        
        output.append(totalCost).append("\n");
    }
}