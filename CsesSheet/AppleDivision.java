
import java.util.Scanner;

public class AppleDivision {
    static long mini=Long.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long arr[]=new long[n];
        long total=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
            total+=arr[i];
        }
        solve(0,0,arr,total);
        System.out.println(mini);
        sc.close();
    }
    public static void solve(int idx, long curr,long arr[], long total){
        if(idx==arr.length){
            long other=total-curr;
            mini=Math.min(mini,Math.abs(curr-other));
            return;
        }
        //exclude
        solve(idx+1,curr,arr,total);
        //include
        solve(idx+1,curr+arr[idx],arr,total);
    }
}
