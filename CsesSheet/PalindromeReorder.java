import java.util.*;

public class PalindromeReorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        long[] count = new long[26];

        // Count frequency of each character
        for (char c : s.toCharArray()) {
            count[c - 'A']++;
        }

        // Check how many characters have odd frequency
        int oddCount = 0;
        for (long freq : count) {
            if (freq % 2 != 0) {
                oddCount++;
            }
        }

        // More than one odd frequency means no palindrome possible
        if (oddCount > 1) {
            System.out.println("NO SOLUTION");
            return;
        }

        StringBuilder firstHalf = new StringBuilder();
        StringBuilder middle = new StringBuilder();

        // Build the palindrome parts
        for (int i = 0; i < 26; i++) {
            char c = (char) (i + 'A');
            long freq = count[i];

            if (freq % 2 != 0) {
                // Add the odd frequency characters fully to the middle
                for (int j = 0; j < freq; j++) {
                    middle.append(c);
                }
            } else {
                // Add half of even frequency characters to the first half
                for (int j = 0; j < freq / 2; j++) {
                    firstHalf.append(c);
                }
            }
        }

        // Construct the full palindrome: first half + middle + reversed first half
        System.out.println(firstHalf.toString() + middle.toString() + firstHalf.reverse().toString());
    }
}
