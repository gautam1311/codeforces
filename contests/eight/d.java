package contests.eight;


import java.util.*;

public class d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }
    public static void solve(Scanner sc){
        int n=sc.nextInt();
        long arr[]=new long[n];
        long  g=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
            g=gcd(g,arr[i]);
        }
        if(g==1){
            System.out.println(2);
            return;
        }
        long ans=-1;
        for(int i=2;i<=100;i++){
            if(gcd(i,g)==1){
                System.out.println(i);
                break;
            }
        }
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
