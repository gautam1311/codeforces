package contests.fourteen;

import java.util.Scanner;

public class e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            int[] arr = new int[n];
            long sum = 0; 
            
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            
            
            int[] r = new int[n];
            r[n - 1] = arr[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                r[i] = Math.min(arr[i], r[i + 1]);
            }
            
            long stay = 0; 
            int[] f = new int[n + 1];
            
            for (int i = 0; i < n; i++) {
                stay += r[i];
                f[r[i]]++;
            }
            
            long mov = sum - stay; 
            long add = 0; 
            
            for (int i = 0; i <= n; i++) {
                if (f[i] > 0) {
                    add = Math.max(add, (long)f[i] - 1);
                }
            }
            
            System.out.println(mov + add);
        }
        
        sc.close();
    }
}
