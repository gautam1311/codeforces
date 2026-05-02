package contests.thirteen;

import java.util.*;
public class e {
    static int l = 1000005;
    
    static int[] fact = new int[l];
    static int[] minP = new int[l];
    static {
        for (int i = 2; i < l; i++) {
            if (minP[i] == 0) { 
                for (int j = i; j < l; j += i) {
                    fact[j]++;
                    if (minP[j] == 0) {
                        minP[j] = i;
                    }
                }
            }
        }
        minP[1] = 1; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder str = new StringBuilder();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            
            boolean sort = true;
            boolean aliceWin = false;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                
                if (i > 0) {
                    if (a[i - 1] > a[i]) {
                        sort = false;
                    }
                    if (minP[a[i - 1]] > minP[a[i]]) {
                        aliceWin = true;
                    }
                }
                if (fact[a[i]] >= 2) {
                    aliceWin = true;
                }
            }

            if (sort) {
                str.append("Bob\n");
            } else if (aliceWin) {
                str.append("Alice\n");
            } else {
                str.append("Bob\n");
            }
        }
        System.out.print(str);
        sc.close();
    }
}
