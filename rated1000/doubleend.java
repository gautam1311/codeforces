package rated1000;

import java.util.Scanner;

public class doubleend {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            solve(sc);
            t--;
        }
        sc.close();
    }
    public static void solve(Scanner sc){
        String a=sc.next();
        String b=sc.next();

        int n=a.length();
        int m=b.length();
        int dp[][]=new int[n+1][m+1];
        int lcs=0;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(a.charAt(i-1)==b.charAt(j-1)){
                    int val=dp[i-1][j-1]+1;
                    dp[i][j]=val;
                    lcs=Math.max(lcs,dp[i][j]);
                }
            }
        }
        int op=n+m-(2*lcs);
        System.out.println(op);
    }
}
