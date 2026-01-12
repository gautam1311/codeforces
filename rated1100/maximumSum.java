
import java.util.*;

public class maximumSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }
    public static void solve(Scanner sc){
        int n=sc.nextInt();
        int k=sc.nextInt();
        long arr[]=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        Arrays.sort(arr);
        long pre[]=new long[n];
        pre[0]=arr[0];
        for(int i=1;i<n;i++){
            pre[i]=arr[i]+pre[i-1];
        }

        long ans=0;
        for(int start=0;start<=k;start++){
            int second=(int)(k-start);
            int left=2*start;
            int right=n-second-1;
            if(left>right){
                continue;
            }
            long sum=pre[right]-(left==0?0:pre[left-1]);
            ans=Math.max(ans,sum);
        }
        System.out.println(ans);
    }
}
