package rated1100;

import java.util.Scanner;

public class Travelling2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder out = new StringBuilder();

        int t = sc.nextInt();
        while (t-- > 0) {
            out.append(solve(sc)).append("\n");
        }

        System.out.print(out.toString());
        sc.close();
    }

    public static long solve(Scanner sc){
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();

        long x[]=new long[n+1];
        long y[]=new long[n+1];
        for(int i=1;i<=n;i++){
            x[i]=sc.nextLong();
            y[i]=sc.nextLong();
        }

        long ans=Math.abs(x[a]-x[b])+Math.abs(y[a]-y[b]);
        long dista=(long)1e17;
        long distb=(long)1e17;
        for(int i=1;i<=k;i++){
            dista=Math.min(dista,Math.abs(x[a]-x[i])+Math.abs(y[a]-y[i]));
            distb=Math.min(distb,Math.abs(x[b]-x[i])+Math.abs(y[b]-y[i]));
        }
        ans=Math.min(ans,dista+distb);
        return ans;
    }
}
