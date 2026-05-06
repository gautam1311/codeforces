
import java.util.Scanner;

public class lunaticContent {
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
        long ans=0;
        for(int i=0;i<n;i++){
            ans=gcd(ans,Math.abs(arr[i]-arr[n-i-1]));
        }
        System.out.println(ans);
    }
    public static long gcd(long a, long b){
        while(b!=0){
            long temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}
