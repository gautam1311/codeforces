package rated1000;

import java.util.Scanner;

public class traingle{
    public static void main(String[] args) {
        // Use Scanner for reading input from the console.
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long w = sc.nextLong();
            long h = sc.nextLong();
            
            // Initialize area to the smallest possible long value.
            long maxArea = Long.MIN_VALUE;
            
            // The outer loop runs 4 times, for the 4 sets of points (sides).
            for (int i = 0; i < 4; i++) {
                // Read the number of points for the current side.
                long k = sc.nextLong();
                long first = 0, last = 0;

                // Read all k points, but we only need the first and the last one.
                for (int j = 0; j < k; j++) {
                    long x = sc.nextLong();
                    if (j == 0) {
                        first = x; // Capture the coordinate of the first point.
                    }
                    if (j == k - 1) {
                        last = x; // Capture the coordinate of the last point.
                    }
                }

                // The base of the potential rectangle is the difference between the
                // last and first points' coordinates.
                long base = last - first;
                
                long height;
                // For the first two sets (i=0, i=1), the height is 'h' (horizontal sides).
                if (i <= 1) {
                    height = h;
                } 
                // For the last two sets (i=2, i=3), the 'height' is 'w' (vertical sides).
                else {
                    height = w;
                }
                
                // Calculate the area for this configuration and update the maximum area found so far.
                maxArea = Math.max(maxArea, base * height);
            }
            
            // Print the final result.
            System.out.println(maxArea);
        }
        
        // Close the scanner to prevent resource leaks.
        sc.close();
    }
}
