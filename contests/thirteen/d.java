package contests.thirteen;

import java.util.*;

public class d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        StringBuilder str = new StringBuilder();

        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            int[] p = new int[n];
            for (int i = 0; i < n; i++) {
                p[i] = sc.nextInt();
            }

            int bLen = y - x;
            int[] b = new int[bLen];
            int minB = Integer.MAX_VALUE;
            int minIdx = -1;
            
            for (int i = 0; i < bLen; i++) {
                b[i] = p[x + i];
                if (b[i] < minB) {
                    minB = b[i];
                    minIdx = i;
                }
            }

            int[] bMin = new int[bLen];
            int idx = 0;
            for (int i = minIdx; i < bLen; i++){
                bMin[idx] = b[i];
                idx++;
            } 
            for (int i = 0; i < minIdx; i++){
                bMin[idx] = b[i];
                idx++;
            } 

            int sLen = n - bLen;
            int[] s = new int[sLen];
            idx = 0;
            for (int i = 0; i < x; i++){
                s[idx] = p[i];
                idx++;
            } 
            for (int i = y; i < n; i++){
                s[idx] = p[i];
                idx++;
            } 

            int k = 0;
            while (k < sLen && s[k] < bMin[0]) {
                k++;
            }
            for (int i = 0; i < k; i++){
                str.append(s[i]).append(" ");
            } 
            for (int i = 0; i < bLen; i++){
                str.append(bMin[i]).append(" ");
            } 
            for (int i = k; i < sLen; i++){
                str.append(s[i]).append("  ");
            } 
            
            str.append("\n");
        }
        System.out.print(str);
        sc.close();
    }
}
