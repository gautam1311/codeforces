package rated1100;

import java.util.Scanner;

public class TNT {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }
        sc.close();
    }
    public static void solve(Scanner sc){
        int n=sc.nextInt();
        long arr[]=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }

        long prefix[]=new long[n];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }

        long ans=0;
        for(int k=1;k<=n;k++){
            if(n%k!=0){
                continue;
            }
            int start=k-1;
            long maxi=prefix[start];
            long mini=prefix[start];

            for(int idx=start+k;idx<n;idx+=k){
                long curr=prefix[idx]-prefix[idx-k];
                maxi=Math.max(maxi,curr);
                mini=Math.min(mini,curr);
            }
            ans=Math.max(ans,maxi-mini);
        }
        System.out.println(ans);
    }
}
