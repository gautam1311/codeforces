package contests.fourteen;

import java.util.Scanner;

public class f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] f = new int[n + 2]; 
            
            long s1 = 0;
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                f[a[i]]++;
                s1 += (long) i * a[i];
            }
            
            int[] q = new int[n + 2]; 
            int run = 0;
            
            for (int h = n; h >= 1; h--) {
                run += f[h];
                q[h] = run;
            }
            
            long s2 = 0; 
            for (int h = 1; h <= n; h++) {
                long k = q[h];
                if (k > 0) {
                    s2 += (k * n) - (k * (k + 1) / 2);
                }
            }
            
            long base = s2 - s1; 
            long mx = 0; 
            
            for (int i = 0; i < n; i++) {
                if (a[i] > 0) {
                    long k = q[a[i]];
                    long gain = i - (n - k); 
                    
                    if (gain > mx) {
                        mx = gain;
                    }
                }
            }
            
            System.out.println(base + mx);
        }
        
        sc.close();
    }
}