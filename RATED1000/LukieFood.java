package RATED1000;

import java.util.Scanner;

public class LukieFood {
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
        int n=sc.nextInt();
        long x=sc.nextLong();
        long arr[]=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        long seg[][]=new long[n][2];
        for(int i=0;i<n;i++){
            seg[i]=new long[]{arr[i]-x,arr[i]+x};
        }
        long ans=0;
        long l=seg[0][0];
        long r=seg[0][1];

        for(int i=1;i<n;i++){
            l=Math.max(l,seg[i][0]);
            r=Math.min(r,seg[i][1]);
            if(l>r){
                ans++;
                l=seg[i][0];
                r=seg[i][1];
            }
        }
        System.out.println(ans);
    }
}
