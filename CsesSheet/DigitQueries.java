import java.util.*;

public class DigitQueries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while (q-- > 0) {
            solve(sc);
        }
        sc.close();
    }

    public static void solve(Scanner sc) {
        long k = sc.nextLong();

        long digLen = 1;  // current digit length
        long count = 9;   // count of numbers with digLen digits
        long start = 1;   // starting index for this group in the infinite string

        // Step 1: Find which digit-length group contains k
        while (k > start + digLen * count - 1) {
            start += digLen * count;
            count *= 10;
            digLen++;
        }

        // Step 2: Find the actual number containing the k-th digit
        long firstNum = (long) Math.pow(10, digLen - 1);
        long numOffset = (k - start) / digLen;
        long targetNum = firstNum + numOffset;

        // Step 3: Find position of the digit within targetNum
        String numStr = Long.toString(targetNum);
        long digitOffset = k - start;
        int posInNum = (int) (digitOffset % digLen);

        System.out.println(numStr.charAt(posInNum));
    }
}
