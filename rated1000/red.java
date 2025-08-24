package rated1000;

import java.util.Scanner;

public class red {
    public static void main(String[] args) {
        // Use Scanner for reading input from the console
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        int t = sc.nextInt();
        
        while (t-- > 0) {
            // Read n, r, and b for each test case
            // Note: 'n' is read but not used in the logic, just like in the C++ code.
            int n = sc.nextInt();
            int r = sc.nextInt();
            int b = sc.nextInt();
            
            // Use StringBuilder for efficient string building in a loop
            StringBuilder s = new StringBuilder();
            
            // Calculate the minimum number of 'R's in each segment
            int lengthOfRed = r / (b + 1);
            
            // Calculate how many segments will get an extra 'R'
            int extraRed = r % (b + 1);
            
            // There will be b+1 segments of 'R's separated by 'B's
            for (int times = 1; times <= b + 1; times++) {
                // Add the base number of 'R's to the current segment
                for (int i = 0; i < lengthOfRed; i++) {
                    s.append('R');
                }
                
                // If there are extra 'R's left, add one to this segment
                if (extraRed > 0) {
                    s.append('R');
                    extraRed--;
                }
                
                // Add a 'B' separator, but not after the last segment
                if (times != b + 1) {
                    s.append('B');
                }
            }
            
            // Print the final constructed string
            System.out.println(s.toString());
        }
        
        // Close the scanner to prevent resource leaks
        sc.close();
    }
}