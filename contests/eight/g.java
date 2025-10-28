package contests.eight;

import java.util.Scanner;

public class g {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }
    public static void solve(Scanner sc){
        int n = sc.nextInt();
        long[] arr = new long[n];
        long[] c = new long[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextLong();
        }
        for (int i = 0; i < n; i++){
            c[i] = sc.nextLong();
        }
        long[] dp = new long[n];
        long ans = 0, total = 0;
        for (long x : c){
            total+=x;
        }

        for (int i = 0; i < n; i++) {
            dp[i] = c[i];
            for (int j = 0; j < i; j++) {
                if (arr[j] <= arr[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + c[i]);
                }
            }
            ans = Math.max(ans, dp[i]);
        }
        System.out.println(total-ans);
    }
}
