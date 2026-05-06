
import java.util.*;
public class countingOrders {
    static int mod=1000000007;
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
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        Arrays.sort(b);
        Integer bb[]=new Integer[n];
        for(int i=0;i<n;i++){
            bb[i]=b[i];
        }
        Arrays.sort(bb,Collections.reverseOrder());

        long res=1;
        for(int i=0;i<n;i++){
            int idx=upper(a,bb[i]);
            int count=n-idx;
            res=(res*Math.max((count-i),0))%mod;
        }
        System.out.println(res);
    }
    public static  int upper(int arr[], int tar){
        int low=0;
        int high=arr.length;
        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]<=tar){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return low;
    }
}
