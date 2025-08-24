package contests.second;

import java.util.*;

public class B {
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
        long arr[]=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        Arrays.sort(arr);
        long ans=0;
        int start=(n%2!=0)?0:1;
        for(int i=start;i<n;i+=2){
            ans+=arr[i];
        }
        System.out.println(ans);
    }
}
