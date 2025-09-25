package contests.fifth;

import java.util.*;

public class b {
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
        Arrays.sort(arr);
        long maxi=Long.MIN_VALUE;
        for(int i=1;i<n;i+=2){
            long curr=arr[i]-arr[i-1];
            maxi=Math.max(maxi,curr);
        }
        System.out.println(maxi);

    }
}
