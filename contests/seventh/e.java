package contests.seventh;

import java.util.Scanner;

public class e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();

        while (testCases-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            int tail = arr[n - 1];
            int[] candidates = new int[3];
            int count = 0;
            for (int val = 1; val <= 3; val++) {
                if (val != tail) {
                    candidates[count++] = val;
                }
            }
            if (count == 0) {  
                candidates[count++] = 1;
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < k; i++) {
                sb.append(candidates[i % count]);
                if (i + 1 < k) sb.append(" ");
            }
            System.out.println(sb);
        }

        sc.close();
    }
}
